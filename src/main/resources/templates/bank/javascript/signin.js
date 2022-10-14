const usernameLabel = "<label for = 'username'>Enter Username: </label>";
const usernameInput = "<input type = 'text' placeholder = 'username' name = 'username' required/>";

const username = usernameLabel + usernameInput + "<br/><br/>";

const passwordLabel = "<label for = 'password'>Enter Password: </label>";
const passwordInput = "<input type = 'password' placeholder = 'password' name = 'password' required/>";

const password = passwordLabel + passwordInput + "<br/><br/>";

const submit = "<button type = 'submit'>Log In</button>";

const form = "<form>" + username + password + submit + "</form>";

document.getElementById("signin_form_container").innerHTML = form;