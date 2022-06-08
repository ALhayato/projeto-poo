package projeto_final;

import java.util.Map;

public interface GerenciaArtigos {
	
	// adiciona um artigo � uma lista de artigos existente
	public boolean adicionarArtigo( Artigo artigo );
	
	// retorna um artigo com base na palavra chave recebida como parametro
	public Artigo getArtigo(String chave);
	
	// apaga um artigo com base na palavra chave recebida como parametro
	public boolean apagarArtigo(String chave);
	
	// edita um artigo com base
	public boolean editarArtigo(Artigo artigo);

	public Map<String, Artigo> getListaArtigos();

	

}