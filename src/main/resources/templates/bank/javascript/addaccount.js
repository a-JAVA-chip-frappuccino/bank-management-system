const typeLabel = "<label for = 'type'>Enter Account Type: </label>";
const typeOption1 = "<option value = 'checking'>Checking Account</option>";
const typeOption2 = "<option value = 'saving'>Savings Account</option>";
const typeOption3 = "<option value = 'mm'>Money Market Account</option>";
const typeOption4 = "<option value = 'cd'>Certificate of Deposit Account</option>";
const typeOptions = typeOption1 + typeOption2 + typeOption3 + typeOption4;

const type = typeLabel + "<select name = 'type'>" + typeOptions + "</select>" + "<br/><br/>";

const balanceLabel = "<label for = 'balance'>Enter Current Balance: </label>";
const balanceInput = "<input type = 'text' placeholder = 'balance' name = 'balance' required/>";

const balance = balanceLabel + balanceInput + "<br/><br/>";

const interestLabel = "<label for = 'interest'>Enter Interest Rate: </label>";
const interestInput = "<input type = 'text' placeholder = 'interest rate' name = 'interest' maxlength = '6' required/>";

const interest = interestLabel + interestInput + "<br/><br/>";

const statementLabel = "<label for = 'statement'>Enter Bank Statement(s): </label>";
const statementInput = "<input type = 'text' placeholder = 'statement' name = 'statement'/>";

const statement = statementLabel + statementInput + "<br/><br/>";

const submit = "<button type = 'submit'>Submit</button>";

const form = "<form>" + type + balance + interest + statement + submit + "</form>";

document.getElementById("addaccount_form_container").innerHTML = form;