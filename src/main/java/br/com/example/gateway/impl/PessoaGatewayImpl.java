package br.com.example.gateway.impl;

import br.com.example.entity.Pessoa;
import br.com.example.gateway.database.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class PessoaGatewayImpl {

    private final PessoaRepository pessoaRepository;

    public void save(Pessoa pessoa){
        log.info("Armazenando informação.");
        pessoaRepository.save(pessoa);
    }

}
