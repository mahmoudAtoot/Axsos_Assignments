package axsos.assignment.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="burgers")
public class Burger {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull
	    @Size(min = 5, max = 100)
	    private String burgerName;
	    @NotNull
	    @Size(min = 5, max = 100)
	    private String resName;
	    @NotNull
	    @Max(5)
	    @Min(0)
	    private Integer rating;
	    
	    @Size(min = 5, max = 300)
	    @NotNull
	    private String notes;
	    // This will not allow the createdAt column to be updated after creation
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Burger() {
	    	
	    }
		public Burger(String burgerName, String resName, Integer rating, String notes) {
			this.burgerName = burgerName;
			this.resName = resName;
			this.rating = rating;
			this.notes = notes;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getId() {
			return id;
		}


		public String getBurgerName() {
			return burgerName;
		}
		public void setBurgerName(String burgerName) {
			this.burgerName = burgerName;
		}
		public String getResName() {
			return resName;
		}
		public void setResName(String resName) {
			this.resName = resName;
		}
		public Integer getRating() {
			return rating;
		}
		public void setRating(Integer rating) {
			this.rating = rating;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		@PrePersist
		protected void onCreate(){
		    this.createdAt = new Date();
		}
		    
		@PreUpdate
		protected void onUpdate(){
		    this.updatedAt = new Date();
		}
	    
}