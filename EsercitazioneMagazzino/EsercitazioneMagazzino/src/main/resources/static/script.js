const URL = ""
fetch(URLEndpoint)
  .then((data) => {
    return data.json();
  })
  .then((response) => {
    // in questo caso la response è un array di oggetti
    console.log(typeof response);

    response.forEach((prodotto) => {
        console.log(prodotto)
    //   cards.appendChild(creaCard(contatto));
    });
    // startTooltips();
  });


startTooltips();

function startTooltips() {
    const tooltipTriggerList = document.querySelectorAll(
      '[data-bs-toggle="tooltip"]'
    );
    const tooltipList = [...tooltipTriggerList].map(
      (tooltipTriggerEl) => new bootstrap.Tooltip(tooltipTriggerEl)
    );
  }

  function creazioneTabella(prodotto) {
    

        const TR = document.createElement('tr');
        const TD1 = document.createElement('td');
        const TD2 = document.createElement('td');
        const TD3 = document.createElement('td');
        const btn = document.createElement("button");
        btn.setAttribute("class", "btn btn-primary")

        btn.addEventListener("click", ()=> {
            window.location.replace(`localhost:9010/api/${prodotto.id}`);
        });
        TD1.textContent = prodotto.nome;
        TD2.textContent = prodotto.giacenza;
        TD3.textContent = prodotto.dettagli;
        TR.append(TD1, TD2, TD3);
        document.querySelector('table tbody').append(TR);
    

}