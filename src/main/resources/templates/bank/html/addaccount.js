import React from "react";
import ReactDOM from "react-dom/client";

function AddAccountForm() {
	
	render (
			
		<form>
		
            <label for = "type">Enter Account Type: </label>
            <select name = "type">
                <option value = "checking">Checking Account</option>
                <option value = "saving">Savings Account</option>
                <option value = "mm">Money Market Account</option>
                <option value = "cd">Certificate of Deposit Account</option>
            </select>

            <br/><br/>

            <label for = "balance">Enter Current Balance: </label>
            <input type = "text" placeholder = "balance" name = "balance" required/>

            <br/><br/>

            <label for = "interest">Enter Interest Rate: </label>
            <input type = "text" placeholder = "interest rate" name = "interest" maxlength = "6" required/>

            <br/><br/>

            <label for = "statement">Enter Bank Statement(s): </label>
            <input type = "text" placeholder = "statement" name = "statement"/>

            <br/><br/>

            <button type = "submit">Submit</button>
            
        </form>
        
	)
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<AddAccountForm />);