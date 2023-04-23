const guardarBtn = document.getElementById('guardar');
const consultarBtn = document.getElementById('consultar');
const fechasDiv = document.getElementById('fechas');

guardarBtn.addEventListener('click', async () => {
    const semestre = {
        fechaInicio: document.getElementById('fechaInicio').value,
        fechaFinal: document.getElementById('fechaFinal').value,
        fechaEvaluacion: document.getElementById('fechaEvaluacion').value,
        fechaExamenes: document.getElementById('fechaExamenes').value,
        fechaHabilitaciones: document.getElementById('fechaHabilitaciones').value
    };
    await fetch('/semestres', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(semestre)
    });
    alert('Fechas guardadas correctamente');
});

consultarBtn.addEventListener('click', async () => {
    const response = await fetch('/semestres');
    const fechas = await response.json();
    fechasDiv.innerHTML = '';
    if (fechas.length === 0) {
        fechasDiv.innerHTML = 'No se encontraron fechas';
        return;
    }
    const ul = document.createElement('ul');
    for (const fecha of fechas) {
        const li = document.createElement('li');
        li.textContent = `${fecha.tipo}: ${fecha.fecha}`;
        ul.appendChild(li);
    }
    fechasDiv.appendChild(ul);
});
