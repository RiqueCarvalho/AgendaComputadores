// --- PARTE DO MENU (O que você já tinha) ---
function toggleMenu() {
    const menu = document.getElementById("menuLateral");

    if (menu.style.right === "0px") {
        menu.style.right = "-300px";
    } else {
        menu.style.right = "0px";
    }
}

// --- PARTE DO ENVIO PARA O BACK-END (O que eu te mandei) ---
const form = document.querySelector('form');

form.addEventListener('submit', (event) => {
    event.preventDefault(); // Impede a página de recarregar

    // Captura os dados usando os IDs que colocamos no HTML
    const agendamento = {
        nomeCompleto: document.getElementById('nomeCompleto').value,
        dataHora: document.getElementById('dataHora').value,
        numeroAlunos: document.getElementById('numeroAlunos').value,
        finalidadeUso: document.getElementById('finalidadeUso').value,
        equipamentos: document.getElementById('equipamentos').value,
        turma: document.getElementById('turma').value
    };

    // Envia para o Spring Boot
    fetch('/api/agendamentos', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(agendamento)
    })
        .then(response => {
            if (response.ok) {
                alert('Agendamento realizado com sucesso!');
                form.reset(); // Limpa o formulário após o sucesso
            } else {
                alert('Erro ao agendar. Verifique se o servidor Java está rodando.');
            }
        })
        .catch(error => {
            console.error('Erro na requisição:', error);
            alert('Erro de conexão com o servidor.');
        });
});