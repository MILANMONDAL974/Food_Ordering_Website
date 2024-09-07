// Import the Vonage package
const Vonage = require('@vonage/server-sdk');

// Create a new Vonage instance with your API key and secret
const vonage = new Vonage({
    apiKey: "001f2429",
    apiSecret: "sPq2m3N3xWLC11gO"
});

// Function to generate a random one-time password
function generateCode() {
    const code = Math.floor(1000 + Math.random() * 9000);
    return code.toString();
}

// Function to send the one-time password via SMS
function sendSMS(toNumber, code) {
    vonage.message.sendSms(
        YOUR_VIRTUAL_NUMBER, // Replace with your Vonage virtual number
        toNumber,
        `Your verification code is ${code}`,
        (err, responseData) => {
            if (err) {
                console.log(err);
            } else {
                if (responseData.messages[0]['status'] === "0") {
                    console.log("SMS sent successfully.");
                } else {
                    console.log(`SMS failed with error: ${responseData.messages[0]['error-text']}`);
                }
            }
        }
    );
}

// Function to validate user inputted code
function validateCode(userCode, generatedCode) {
    if (userCode === generatedCode) {
        return true;
    } else {
        return false;
    }
}

// Export the generateCode, sendSMS, and validateCode functions for use in your project
module.exports = { generateCode, sendSMS, validateCode };
