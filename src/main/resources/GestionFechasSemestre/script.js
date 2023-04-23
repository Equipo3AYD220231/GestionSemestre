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
