const form = document.querySelector('form');
const searchInput = document.querySelector('input[name="search_box"]');
const productsSection = document.querySelector('#products-section');

form.addEventListener('submit', (event) => {
   event.preventDefault(); // prevent the form from submitting
   const searchText = searchInput.value.toLowerCase();
   const forms = productsSection.querySelectorAll('form');
   let noResultsMessage = document.querySelector('#no-results-message');
   if (noResultsMessage) {
      noResultsMessage.remove(); // remove existing message if present
   }
   let resultsCount = 0;
   forms.forEach((form) => {
      const text = form.querySelector('.name').textContent.toLowerCase();
      if (text.includes(searchText)) {
         form.style.display = 'block';
         productsSection.insertBefore(form.parentNode, productsSection.firstChild);
         resultsCount++;
      } else {
         form.style.display = 'none';
      }
   });
   if (resultsCount === 0) { // show no results message if there are no matching forms
      let message = document.createElement('p');
      message.setAttribute('id', 'no-results-message');
      message.textContent = "Looks like we don't have that in our menu :( Try looking for something else?";
      productsSection.appendChild(message);
      message.style.textAlign = 'center';
      message.style.fontSize = '2rem';
      message.style.fontWeight = 'bold';
      message.style.marginTop = '30px';
      message.style.position = 'absolute';
      message.style.top = '50%';
      message.style.left = '50%';
      message.style.transform = 'translate(-50%, -50%)';
      message.style.fontFamily = 'Arial';
   }
});