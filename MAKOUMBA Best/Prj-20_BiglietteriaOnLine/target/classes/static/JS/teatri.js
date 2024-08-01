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
            rowCont1.appendChild(creaCard(teatri));
        });
    })
}

function creaCard(teatri){
    let card = document.createElement("div");
    card.setAttribute("class", "card col-4 p-2 mb-3 mt-3");

    let cardBody = document.createElement("div");
cardBody.setAttribute("class", "card-body");
    
  cardBody.innerHTML  = `<h3 class="card-title">${teatri.nome}</h3>
                  <h5 class="card-text">Indirizzo: ${teatri.indirizzo}</h5>
                  <h5 class="card-text">citta: ${teatri.citta}</h5>
                  <h5 class="card-text">Provincia: ${teatri.provincia}</h5>
                  <h5 class="card-text">Telefono: ${teatri.telefono}</h5>
                  <h5 class="card-text">Posti: ${teatri.posti}</h5>`;

                  card.appendChild(cardBody);
                 
            return card;
}


teatro.addEventListener("click", leggiTeatri);

