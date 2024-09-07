// select all add to cart buttons
const addToCartButtons = document.querySelectorAll('button[name="add_to_cart"]');

// loop through the buttons and attach event listener
addToCartButtons.forEach(button => {
  button.addEventListener('click', addToCart);
});

function addToCart(event) {
    // Get the item details from the DOM
    const itemBox = event.target.closest('.box');
    const itemName = itemBox.querySelector('.name').textContent;
    const itemPrice = itemBox.querySelector('.price').textContent;
    const itemImageSrc = itemBox.querySelector('img').getAttribute('src');
  
    // Create a new object with the item details
    const item = {
      name: itemName,
      price: itemPrice,
      img: itemImageSrc,
      quantity: 1
    };
  
    // Get the existing cart items from local storage
    let cartItems = JSON.parse(localStorage.getItem('cartItems')) || [];
  
    // Check if the item is already in the cart
    const existingItem = cartItems.find(i => i.name === itemName);
  
    if (existingItem) {
      // If the item is already in the cart, increment the quantity
      existingItem.quantity++;
    } else {
      // If the item is not in the cart, add it to the array
      cartItems.push(item);
    }
  
    // Save the updated cart items to local storage
    localStorage.setItem('cartItems', JSON.stringify(cartItems));
  
    // Alert the user that the item has been added to the cart
    alert(`${itemName} has been added to your cart!`);
  }
  