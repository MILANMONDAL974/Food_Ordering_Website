const http = require('http');
const { generateCode, sendSMS, validateCode } = require('./index');

const server = http.createServer((req, res) => {
  res.setHeader('Content-Type', 'text/html');

  if (req.method === 'POST') {
    if (req.url === '/register') {
      let body = [];
      req.on('data', (chunk) => {
        body.push(chunk);
      });
      req.on('end', () => {
        body = Buffer.concat(body).toString();
        const { name, phoneNumber } = JSON.parse(body);
        console.log('Phone Number:', phoneNumber);
        const code = generateCode();
        sendSMS(phoneNumber, code);

        res.writeHead(200);
        res.write(`Verification code sent to ${phoneNumber}`);
        res.end();
      });
    } else if (req.url === '/verify') {
      let body = [];
      req.on('data', (chunk) => {
        body.push(chunk);
      });
      req.on('end', () => {
        body = Buffer.concat(body).toString();
        const { userCode, generatedCode } = JSON.parse(body);
        const isValid = validateCode(userCode, generatedCode);

        res.writeHead(isValid ? 200 : 400);
        res.write(isValid ? 'Verification successful' : 'Verification code invalid');
        res.end();
      });
    }
  }
});

server.listen(3000, () => {
  console.log('Server running at http://localhost:3000/');
});
