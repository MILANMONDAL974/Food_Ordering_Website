// Get cart items from localStorage
let cartItems = [];
const localStorageCartItems = localStorage.getItem("cartItems");
if (localStorageCartItems) {
  cartItems = JSON.parse(localStorageCartItems);
}

// Get reference to the cart table body element
const cartTableBody = document.getElementById("cartTableBody");

// Get reference to the cart item count element
const cartItemCountElement = document.getElementById("cartItemCount");

// Update the text content of the element with the cart item count
cartItemCountElement.textContent = `${cartItems.length}  `;

// Initialize total price to 0
let totalPrice = 0;


// Loop through the cart items and add up the prices
cartItems.forEach((item) => {
    let itemPrice = parseFloat(item.price.replace("$", ""));
    let itemQuantity = parseInt(item.quantity);
    if (isNaN(itemPrice)) {
      console.log(`Invalid price: ${item.price}`);
    } else {
      totalPrice += itemPrice * itemQuantity;
    }
  });
  
// Display the total price on the page
const totalPriceElement = document.getElementById("totalPrice");
totalPriceElement.textContent = `$${totalPrice.toFixed(2)}`;

// Loop through the cart items and create table rows
cartItems.forEach((item, index) => {
  const tableRow = document.createElement("tr");
  tableRow.innerHTML = `
    <td data-th="Product">
      <div class="row">
        <div class="col-md-3 text-left">
          <img src="${item.img}" alt="" class="img-fluid d-none d-md-block rounded mb-2 shadow ">
        </div>
        <div class="col-md-9 text-left mt-sm-2">
          <h4>${item.name}</h4>
          <p class="font-weight-light">${item.price}</p>
        </div>
      </div>
    </td>
    <td data-th="Price">${item.price}</td>
    <td data-th="Quantity">
      <input type="number" class="form-control form-control-lg text-center" value="${item.quantity}">
    </td>
    <td class="actions" data-th="">
      <div class="text-right">
        <button class="btn btn-dark btn-lg update-btn" data-index="${index}">
          <i class="fas fa-sync"></i>
        </button>
        <button class="btn btn-lg delete-btn btn-danger" data-index="${index}">
          <i class="fas fa-trash"></i>
        </button>
      </div>
    </td>
  `;


  // Add event listener to the trash button
const deleteButton = tableRow.querySelector(".delete-btn");
deleteButton.addEventListener("click", (event) => {
  const name = event.target.closest("tr").querySelector("h4").textContent;
  console.log("Delete button clicked for item with name:", name);
  removeFromCart(name);
  tableRow.remove();
});

  

  
  
  

  cartTableBody.appendChild(tableRow);
});



function removeFromCart(name) {
  let cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];
  const removedItem = cartItems.find(item => item.name === name);

  if (!removedItem) {
    console.log(`Item with name ${name} not found in cart`);
    return;
  }

  const removedItemPrice = parseFloat(removedItem.price.replace("$", "")) * removedItem.quantity;

  cartItems = cartItems.filter(item => item.name !== name);
  localStorage.setItem("cartItems", JSON.stringify(cartItems));

  const totalPriceElement = document.getElementById("totalPrice");
  let totalPrice = parseFloat(totalPriceElement.textContent.replace("$", ""));
  totalPrice -= removedItemPrice;
  totalPriceElement.textContent = `$${totalPrice.toFixed(2)}`;

  console.log(`Item with name ${name} removed from cart`);
}




