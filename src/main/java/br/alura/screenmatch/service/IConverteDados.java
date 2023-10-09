package br.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obbterDados(String json, Class <T> classe);

}
