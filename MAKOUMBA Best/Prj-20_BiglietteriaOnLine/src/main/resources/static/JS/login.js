let login = "http://localhost:9022/login.html";

let mioForm = document.querySelector("#mioForm");

mioForm.addEventListener("submit", function(){
    let email = document.querySelector("#floatingInput").value;

    fetch(login)
    .then(data =>{return data.json})
    .then(response => {
        response = response.filter((cliente) => cliente.email == email);

        if(response.length > 0){
            localStorage.setItem("userConnesso", JSON.stringify(response));
            location.href = "./index.html";
        }
        else {
            document.querySelector("#feed").innerHTML = "<h3>Email errato !! </h3>"
        }
        
        console.log(response);
        return response;
    })
})