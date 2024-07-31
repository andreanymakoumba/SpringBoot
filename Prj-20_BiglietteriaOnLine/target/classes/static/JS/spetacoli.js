let Spetacoli = document.querySelector("#spetacoli");
let rowCont1 = document.querySelector("#cont1 .row");


let URL = "http://localhost:9022/api";

function leggiSpetacoli(){ 
    let endpoint = "/Spetacoli";

    fetch(URL+endpoint)
    .then(data =>{
        return data.json();
    })
    .then(response => {
        rowCont1.innerHTML = "";
        console.log(response);
        response.forEach(spetacolo => {
            rowCont1.innerHTML += creaCard(spetacolo);
        });
    })
}

function creaCard(spetacolo) {
    let card = `<div class="col-4 mt-3">
          <div class="card">
              <div class="card-body">
                  <h3 class="card-title">${spetacolo.titolo}</h3>
                  <h5 class="card-text">Autore: ${spetacolo.autore}</h5>
                  <h5 class="card-text">Regista: ${spetacolo.regista}</h5>
                  <h5 class="card-text">Prezzo: ${spetacolo.prezzo}</h5>
                  <p><strong>Teatro</strong></p>
                  <ul>
                      <li>Nome: ${spetacolo.teatro.nome}</li>
                      <li>Indirizzo: ${spetacolo.teatro.indirizzo}</li>
                      <li>Città: ${spetacolo.teatro.citta}</li>
                      <li>Provincia: ${spetacolo.teatro.provincia}</li>
                      <li>Telefono: ${spetacolo.teatro.telefono}</li>
                      <li>Posti: ${spetacolo.teatro.posti}</li>
                  </ul>
              </div>
          </div>
      </div>`;
    return card;
  }

Spetacoli.addEventListener("click", leggiSpetacoli);