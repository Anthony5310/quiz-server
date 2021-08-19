package com.abariller.quiz.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Question.
 */
@Entity
@Table(name = "question")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "entitled")
    private String entitled;

    @NotNull
    @Column(name = "suggestions", nullable = false)
    private String suggestions;

    @NotNull
    @Column(name = "answer", nullable = false)
    private String answer;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question id(Long id) {
        this.id = id;
        return this;
    }

    public String getEntitled() {
        return this.entitled;
    }

    public Question entitled(String entitled) {
        this.entitled = entitled;
        return this;
    }

    public void setEntitled(String entitled) {
        this.entitled = entitled;
    }

    public String getSuggestions() {
        return this.suggestions;
    }

    public Question suggestions(String suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    public String getAnswer() {
        return this.answer;
    }

    public Question answer(String answer) {
        this.answer = answer;
        return this;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Question)) {
            return false;
        }
        return id != null && id.equals(((Question) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Question{" +
            "id=" + getId() +
            ", entitled='" + getEntitled() + "'" +
            ", suggestions='" + getSuggestions() + "'" +
            ", answer='" + getAnswer() + "'" +
            "}";
    }
}
