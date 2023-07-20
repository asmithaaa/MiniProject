import React, { useRef } from "react";
import emailjs from "@emailjs/browser";
import styled from "styled-components";


const Contact = () => {

    const form = useRef();

  const sendEmail = (e) => {
    e.preventDefault();

    emailjs.sendForm('service_zotbmf8', 'template_rh9fpvg', form.current, 'z6pU2_owQKWjn00wk')
      .then((result) => {
          console.log(result.text);
          console.log("message sent");
      }, (error) => {
          console.log(error.text);
      });
  };

  return (
    <StyledContactForm>
      <p className="Team">ContactUs</p>
      <form ref={form} onSubmit={sendEmail}>
      <label>Name</label>
      <input type="text" name="user_name" />
      <label>Email</label>
      <input type="email" name="user_email" />
      <label>Message</label>
      <textarea name="message" />
      <input type="submit" value="Send" />
    </form>
    </StyledContactForm>
  )
};

export default Contact;

// Styles
const StyledContactForm = styled.div`
  width: 400px;
  p{
    text-align:center;
    font-size: 60px;
    margin-left:600px;
  }

  form {
    display: flex;
    align-items: flex-start;
    flex-direction: column;
    width: 100%;
    font-size: 16px;

    input {
      width: 100%;
      height: 50px;
      padding: 7px;
      outline: none;
      margin-left: 500px;
      border-radius: 5px;
      border: 1px solid rgb(220, 220, 220);

      &:focus {
        border: 2px solid rgba(0, 206, 158, 1);
      }
    }

    textarea {
      max-width: 100%;
      min-width: 100%;
      width: 100%;
      max-height: 100px;
      min-height: 100px;
      margin-left: 500px;
      padding: 7px;
      outline: none;
      border-radius: 5px;
      border: 1px solid rgb(220, 220, 220);

      &:focus {
        border: 2px solid rgba(0, 206, 158, 1);
      }
    }

    label {
      margin-top: 1rem;
      margin-left:400px;
      font-size: 30px;
    }

    input[type="submit"] {
      margin-top: 2rem;
      cursor: pointer;
      background: #000;
      color: white;
      font-family: 'Chela One';
      border: none;
      font-size:40px;
    }
  }
`;