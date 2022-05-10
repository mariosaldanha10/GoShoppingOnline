# GoShoppingOnline
Online Shopping App
Make an online shopping app consuming JSON API hosted at https://fakestoreapi.com fulfilling the following requirements. 

You are allowed to make your own decisions on implementing the requirements, such as deciding layouts, data types, etc. Use common assumptions based on the real-world online shopping apps you have used e.g Cart total should have float values rounded to 2 decimals; Product quantity in cart can't be zero or negative. In case you could not decide between two design choices, check the best practices and see what's recommended. Log important design decisions in README.md



Requirements:
- [x] Authentication
- [x] Allow User to Signup
- [x] Log In using username and password
- [x] Store userID and token once logged in, to keep the user logged in (even after restarting the app)
- [] Product Listing
- [] List Product Categories
- [] On clicking a Category, list Products in that Category
- [] On clicking a Product, show Product description, show buy button and controls to change quantity.
- [] Cart
- [] Show cart summary
- [] Show total amount
- [] Purchase button to place an order, show order notification
- [] Show order history
- [] List users orders
- [] On clicking an Order, show Order details and Products ordered
- [] On clicking a Product, take them to Product description page created for 3.3
- [x] Show User details
- [x] Use the stored userID to show user details
- [] Show a random circular profile image from https://thispersondoesnotexist.com/
- [] Show Logout button, on click take back to Signup / Log In page (Restart should not auto login after logout)
- [x] UI/Implementational Requirements
- [] RecyclerView used for all Lists: Categories, Products, Orders
- [x] If logged in, attach authentication token to all requests until logout
- [] Add a small "About this app" button in the profile page, that shows a page on click with your copyright details and credits

Bonus
- []ViewPager2 with bottom TabLayout for: Shop, Cart, Orders, Profile icons
- []Show a map marker based on the GPS co-ordinates in user profile (Hint: Follow instructions given here)


