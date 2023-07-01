package med.voll.api.controller.medico;

import med.voll.api.enums.Especialidades;
import med.voll.api.medico.Medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidades especialidade) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}