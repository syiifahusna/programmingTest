let alerts = document.getElementById("alerts");
const name = document.getElementById("name");
const dob = document.getElementById("dob");
const address = document.getElementById("address");
const postcode = document.getElementById("postcode");
const state = document.getElementById("state");

postcode.addEventListener("focusout", function(){
    alerts.innerHTML = ``;
    let postcodeValue = this.value;

    //validation
    if(postcodeValue.length == 5){
        findState(postcodeValue);
    }else{
        alerts.innerHTML = `
        <div class="alert alert-danger" role="alert">
            Postcode error
        </div>`;
        postcode.value = ``;
        state.value = ``;
    }
    
});

function findState(postcodeValue){

    const xhttp = new XMLHttpRequest();
        xhttp.onload = function(){
            let stateObj = JSON.parse(this.responseText);

            if(stateObj.name == "null"){
                state.value = "Unknown";
            }else{
                state.value = stateObj.name;
            }
        }
        xhttp.open("GET","http://localhost:8080/api/state/postcode?postcode="+postcodeValue);
        xhttp.send();

}

//============================================================

const saveDataForm = document.getElementById("saveDataForm"); 

saveDataForm.addEventListener("submit", function(e){
    e.preventDefault();
    saveData();
})

function saveData(){

    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
        console.log(this.responseText);
        alerts.innerHTML = `
        <div class="alert alert-success" role="alert">
            Data saved
        </div>`

        name.value = ``;
        dob.value = ``;
        address.value = ``;
        postcode.value = ``;
        state.value = ``;

    }
    xhttp.open("POST","http://localhost:8080/api/person/save");
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("name="+name.value+"&dob="+dob.value+"&address="+address.value+"&postcode="+postcode.value+"&state="+state.value);

}








