package med.voll.api.controller.medico.DTO;

import med.voll.api.enums.Especialidades;
import med.voll.api.medico.Medico;

public record DadosListagemMedico(Long id, String nome, String email, String crm, Especialidades especialidade) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }



}