const cartItems = JSON.parse(localStorage.getItem('cartItems'));

const cartItemsElement = document.querySelector('.cart-items');
const grandTotalElement = document.querySelector('.grand-total .price');

let grandTotal = 0;

// Loop through the cart items and create HTML for each item
for (let i = 0; i < cartItems.length; i++) {
  const item = cartItems[i];
  const itemHTML = `
    <p><span class="name">${item.name}</span><span class="price">${item.price}</span></p>
  `;
  cartItemsElement.insertAdjacentHTML('beforeend', itemHTML);
  
  // Add the item price to the grand total
  const itemPrice = Number(item.price.replace('$', '').replace('/-', ''));
  grandTotal += itemPrice;
}

// Update the grand total element with the calculated value
grandTotalElement.textContent = `$${grandTotal}/-`;