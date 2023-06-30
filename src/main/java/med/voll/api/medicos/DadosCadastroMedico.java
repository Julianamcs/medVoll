package med.voll.api.medicos;

import med.voll.api.endereco.DadosEndereco;
import med.voll.api.medicos.unems.Especialidade;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
