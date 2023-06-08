package estrutura.dados.arvore.binaria;

public class ArvoreBinaria<T extends Comparable<T>> {
    private ElementoArvore<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public boolean adicionarElemento(T valor) {
        ElementoArvore<T> novoElemento = new ElementoArvore<>(valor);

        if (this.raiz == null) {
            this.raiz = novoElemento;
            return true;
        }

        return encontrarLocalElemento(this.raiz, novoElemento);
    }

    private boolean encontrarLocalElemento(ElementoArvore<T> atual, ElementoArvore<T> novoElemento) {
        if (novoElemento.getValor().compareTo(atual.getValor()) < 0) {
            if (atual.getEsquerda() != null) {
                encontrarLocalElemento(atual.getEsquerda(), novoElemento);
            } else {
                atual.setEsquerda(novoElemento);
            }
        } else {
            if (novoElemento.getValor().compareTo(atual.getValor()) > 0) {
                if (atual.getDireita() != null) {
                    encontrarLocalElemento(atual.getDireita(), novoElemento);
                } else {
                    atual.setDireita(novoElemento);
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean buscarElemento(T valor) {
        ResultadoBusca<T> resultadoBusca = buscarElementoAlgoritmo(null, this.raiz, valor);

        return resultadoBusca != null;
    }

    private ResultadoBusca<T> buscarElementoAlgoritmo(ElementoArvore<T> paiAtual, ElementoArvore<T> atual, T valor) {
        if (atual == null)
            return null;

        if (valor.compareTo(atual.getValor()) < 0) {
            return buscarElementoAlgoritmo(atual, atual.getEsquerda(), valor);
        }

        if (valor.compareTo(atual.getValor()) > 0)
            return buscarElementoAlgoritmo(atual ,atual.getDireita(), valor);

        return new ResultadoBusca<>(paiAtual, atual);
    }

    public boolean removerElemento(T valor) {
        ResultadoBusca<T> resultadoBusca = buscarElementoAlgoritmo(null, this.raiz, valor);

        if (resultadoBusca == null)
            return false;

        ElementoArvore<T> paiAtual = resultadoBusca.getPaiAtual();
        ElementoArvore<T> atual = resultadoBusca.getAtual();

        if (atual.getEsquerda() != null && atual.getDireita() != null) {
            ElementoArvore<T> paiSubstituto = null;
            ElementoArvore<T> substituto = atual.getDireita();

            while (substituto.getEsquerda() != null) {
                paiSubstituto = substituto;
                substituto = substituto.getEsquerda();
            }

            atual.setValor(substituto.getValor());

            if (paiSubstituto != null) {
                if (substituto.getDireita() != null) {
                   paiSubstituto.setEsquerda(substituto.getDireita());
                } else {
                    paiSubstituto.setEsquerda(null);
                }
            } else {
                atual.setDireita(null);
            }

        } else {
            if (atual.getEsquerda() != null) {
                if (paiAtual.getEsquerda().getValor().compareTo(atual.getValor()) == 0) {
                    paiAtual.setEsquerda(atual.getEsquerda());
                } else {
                    paiAtual.setDireita(atual.getEsquerda());
                }

                atual.setEsquerda(null);
            } else {
                if (atual.getDireita() != null) {
                    if (paiAtual.getEsquerda().getValor().compareTo(atual.getValor()) == 0) {
                        paiAtual.setEsquerda(atual.getDireita());
                    } else {
                        paiAtual.setDireita(atual.getDireita());
                    }

                    atual.setDireita(null);
                } else {
                    if (paiAtual.getEsquerda() != null && paiAtual.getEsquerda().getValor().compareTo(atual.getValor()) == 0 ) {
                        paiAtual.setEsquerda(null);
                    } else {
                        paiAtual.setDireita(null);
                    }
                }
            }
        }

        return true;
    }

    public String imprimirEmPreOrdem() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Impressão em Pré ordem: ");

        imprimirEmPreOrdemAlgoritmo(this.raiz, stringBuilder);

        return stringBuilder.toString();
    }

    private void imprimirEmPreOrdemAlgoritmo(ElementoArvore<T> atual, StringBuilder stringBuilder) {
        if (atual != null) {
            stringBuilder.append(atual.getValor()).append(" ");
            imprimirEmPreOrdemAlgoritmo(atual.getEsquerda(), stringBuilder);
            imprimirEmPreOrdemAlgoritmo(atual.getDireita(), stringBuilder);
        }
    }

    public String imprimirEmOrdem() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Impressão em ordem: ");

        imprimirEmOrdemAlgoritmo(this.raiz, stringBuilder);

        return stringBuilder.toString();
    }

    private void imprimirEmOrdemAlgoritmo(ElementoArvore<T> atual, StringBuilder stringBuilder) {
        if (atual != null) {
            imprimirEmOrdemAlgoritmo(atual.getEsquerda(), stringBuilder);
            stringBuilder.append(atual.getValor()).append(" ");
            imprimirEmOrdemAlgoritmo(atual.getDireita(), stringBuilder);
        }
    }

    public String imprimirEmPosOrdem() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Impressão em Pós ordem: ");

        imprimirEmPosOrdemAlgoritmo(this.raiz, stringBuilder);

        return stringBuilder.toString();
    }

    private void imprimirEmPosOrdemAlgoritmo(ElementoArvore<T> atual, StringBuilder stringBuilder) {
        if (atual != null) {
            imprimirEmPosOrdemAlgoritmo(atual.getEsquerda(), stringBuilder);
            imprimirEmPosOrdemAlgoritmo(atual.getDireita(), stringBuilder);
            stringBuilder.append(atual.getValor()).append(" ");
        }
    }

    public void deletarArvore() {
        deletarArvoreAlgoritmo(this.raiz);
    }

    public void deletarArvoreAlgoritmo(ElementoArvore<T> atual) {
        if (atual != null) {
            deletarArvoreAlgoritmo(atual.getEsquerda());
            deletarArvoreAlgoritmo(atual.getDireita());
            atual.setEsquerda(null);
            atual.setDireita(null);
        }

        this.raiz = null;
    }
}
