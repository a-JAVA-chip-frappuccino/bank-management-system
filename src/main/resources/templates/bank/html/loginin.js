import React from "react";
import ReactDOM from "react-dom/client";

function LoginForm() {
	
	return (
			
		<form>
			
        	<label for = "username">Enter Username: </label>
        	<input type = "text" placeholder = "username" name = "username" required/>

        	<br/><br/>

        	<label for = "password">Enter Password: </label>
        	<input type = "password" placeholder = "password" name = "password" required/>

        	<br/><br/>

            <button type = "submit">Log In</button>
            
        </form>
        
	)
	
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<LoginForm />);