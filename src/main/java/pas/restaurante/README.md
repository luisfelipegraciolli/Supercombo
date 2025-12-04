# Supercombo - Sistema de Cardápio para Restaurante

Este projeto implementa um sistema de gerenciamento de cardápio para um restaurante, utilizando o **Padrão de Projeto Composite** para organizar pratos, bebidas, combos e mega combos de forma hierárquica e flexível.

## Problema Resolvido

O objetivo era criar uma estrutura onde itens individuais (pratos, bebidas) pudessem ser agrupados em combos, e esses combos, por sua vez, pudessem ser agrupados em mega combos, além de permitir que itens individuais fossem adicionados diretamente a qualquer nível de agrupamento.

A solução baseia-se na interface `ItemCardapio` e na classe `CompostoCardapio`, que atua como o componente principal do padrão Composite, permitindo a composição recursiva de itens.