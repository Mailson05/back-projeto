package med.voll.api.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuarios(
        @NotBlank(message = "Login é Obrigatorio!!!")
        String login,

        @NotBlank(message = "Senha é Obrigatoria!!!")
        String senha) {
}
