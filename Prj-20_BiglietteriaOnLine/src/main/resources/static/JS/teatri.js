let teatro = document.querySelector("#teatro");
let rowCont1 = document.querySelector("#cont1 .row");


let URL = "http://localhost:9022/api";

function leggiTeatri(){ 
    let endpoint = "/Teatri";

    fetch(URL+endpoint)
    .then(data =>{
        return data.json();
    })
    .then(response => {
        rowCont1.innerHTML = "";
        console.log(response);
        response.forEach(teatri => {
            rowCont1.innerHTML += creaCard(teatri);
        });
    })
}

function creaCard(teatri){

    let card = `<div class="col-4">
        <div class="card">
            <div class="card-body">
                <h3 class="card-title">${teatri.name}</h3>
                <h5 class="card-text">${teatri.indirizzo}</h5>
                <h5 class="card-text">${teatri.citta}</h5>
                <h5 class="card-text">${teatri.provincia}</h5>
                <h5 class="card-text">${teatri.telefono}</h5>
                <h5 class="card-text">${teatri.posti}</h5>
            </div>
            </div>
            </div>`
            return card;
}


teatro.addEventListener("click", leggiTeatri);