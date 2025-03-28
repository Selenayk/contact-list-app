package io.selly.contactapi.domain;

import org.hibernate.annotations.UuidGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name = "contacts")
public class Contact {
	@Id
	@UuidGenerator
	@Column(name = "id", unique = true, updatable = false)
	private String id;
	private String name;
	private String email;
	private String title;
	private String phone;
	private String address;
	private String status;
	private String photoUrl;
}
