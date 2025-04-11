package curso.spring.CadastroDeNinjas.Missoes;

import curso.spring.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro_missoes")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String localizacao;
    private char rank;
    private String descricao;

    // @OneToMany uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

    public List<NinjaModel> getNinja() {
        return ninjas;
    }

    public void setNinja(List<NinjaModel> ninja) {
        this.ninjas = ninja;
    }

    public MissaoModel() {}
    public MissaoModel(String localizacao, char rank, String descricao) {
        this.localizacao = localizacao;
        this.rank = rank;
        this.descricao = descricao;
    }
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }
}
