<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Mohammad Hussain (msh52)</td></tr>
<tr><td> <em>Generated: </em> 11/25/2023 3:03:12 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone3/grade/msh52" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T06.45.06image.png.webp?alt=media&token=d31877a3-7a95-45a7-b262-6fe388b3935d"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing host and port number<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T06.46.00image.png.webp?alt=media&token=51408053-decb-47b0-a7ff-bac81d2b325c"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the username<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <div>The program starts by opening a window with text fields and labels to<br>collect information from users.The Host and the Port and then, after clicking 'next',<br>it asks for the Username.</div><div><br></div><div>First, there's a line of code JLabel hostLabel =<br>new JLabel("Host:"); that creates a label for the Host section. Next to this<br>label is a text box. The default address in this box is set<br>to 127.0.0.1, but users can change it to something else if they need<br>to.</div><div><br></div><div>Then, there's another line JLabel portLabel = new JLabel("Port:"); which makes a label<br>for the Port. This label is for the field where users enter the<br>port number. This part is similar to the host section, but the default<br>port number here is 3000.</div><div><br></div><div>Finally, there's a line JLabel userLabel = new JLabel("Username:<br>"); that creates a label for the Username. This label is for the<br>field where users can enter their chosen username. It's an empty text box<br>ready for users to type in their username.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T06.49.00image.png.webp?alt=media&token=8bdc5451-5235-486f-b1cb-11e72d120d64"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing a list of users in the room<br>, chat message area with chat<br>history, the create message area and its send button,<br><br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T06.53.58image.png.webp?alt=media&token=c3747f2a-9249-4faf-8f91-e453ee86d7c1"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the code snippet that lets you enter key send the message<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T06.58.38image.png.webp?alt=media&token=9263ba0f-31ce-4bb3-883f-a26329132d4f"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the result of /flip, /roll 100 and /roll 2d6 also who triggered<br>it<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.04.26image.png.webp?alt=media&token=c5e30271-5c65-46be-8603-3607a0752c77"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the server-side code for /flip and /roll<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.06.26image.png.webp?alt=media&token=0cad1416-ba51-4fc4-8250-60cb45e35b48"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the /roll generation specific code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.07.48image.png.webp?alt=media&token=84a19e0a-da9a-4367-bcfe-f7e5df1a34d4"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the /roll generation specific code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.08.39image.png.webp?alt=media&token=99f82ba7-5286-4573-be82-78b11cb29c8b"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing /flip specific generation code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <div><br></div><div>The /roll Command</div><div><br></div><div>When a client sends a message starting with /roll, the server's<br>processPayload method checks it. If it finds /roll, it then uses the processRollCommand<br>method, giving it the message to look at more closely. This method checks<br>the message: if there's a "d" in it, it figures out the number<br>of dice and how many sides each die has. If there's no "d",<br>it assumes it's a command to roll a number between 0 and X,<br>or 1 and X, where X is the biggest number it can roll.<br>The server then rolls the dice randomly and adds up the total. It<br>makes a message with all the roll results and the total, and sends<br>this to everyone in the room.</div><div><br></div><div>The /flip Command</div><div><br></div><div>If the message starts with /flip,<br>the server's processPayload method spots this and calls the processFlipCommand method. This method<br>picks a random number between 0 and 1. If it's less than 0.5,<br>it says 'Heads'; otherwise, it's 'Tails'. Then the server makes a message about<br>the coin flip result and sends it to everyone in the room.</div><div><br></div><div>Client-Server-Client Flow</div><div><br></div><div>Here's<br>how it works: The client sends a message to the server with the<br>command /roll or /flip. The server's processPayload method gets the message and checks<br>what type it is. If it's a roll or flip command, it sends<br>the message to the right method - processRollCommand or processFlipCommand. These methods make<br>the roll or flip result and put it in a message. The server<br>then sends this message back to all the clients in the same room.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.22.34image.png.webp?alt=media&token=93a03f3e-1dcb-47d3-a09f-cae563764790"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing the result of bold, italic, underline, colors, and all in one working.<br>Line<br>1: Bold<br>line 2: Italic<br>line 3: Underline<br>line 4, 5, 6: colors, red, blue, green<br>Line<br>7: Combinations of everything<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T08.18.25image.png.webp?alt=media&token=91beef84-fde7-4ee8-9af6-e9ab35bd2f1c"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>In the ChatPanel.java file, there&#39;s a method called addText. This method is used<br>to make the text received from the server look nicer with things like<br>bold, italics, underlining, and different colors. It works by turning the text into<br>HTML format after applying these formatting styles. Then, a JEditorPane is used to<br>show this text. This JEditorPane is set up to handle &quot;text/html&quot; content, which<br>ensures that the styled text shows up correctly in the chat area. The<br>JEditorPane is also made so that nobody can edit it, and its background<br>is made transparent to fit well with the rest of the chat area&#39;s<br>look. By using HTML tags for styling and setting the JEditorPane to &quot;text/html&quot;,<br>the chat interface can show messages with all the formatting, making them look<br>organized and nice in the chat area.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.42.45image.png.webp?alt=media&token=17859ed8-0045-4c04-b6b9-f8f1f1c8ca8d"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing client shah sending message to noyon and abul cant see, also shah<br>sending message to abul which noyon cant see. also client abul sending message<br>to noyon and shah cant see. and noyon sending message to shah which<br>abul cant see.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.47.26image.png.webp?alt=media&token=8b5db031-64ed-4cea-b058-c98329a925ad"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing code of server-side to see if the message starts with @<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.49.16image.png.webp?alt=media&token=d2b2c520-1f9f-4cd3-8014-1f428a292360"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing code snippet of processPrivateMessage function which deals with the logic of the<br>command<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <div>The code snippet looks at messages to see if they start with the<br>@ symbol. If they do, it uses the processPrivateMessage method to deal with<br>the private message. First, it figures out who the message is for by<br>looking for the space right after @ and taking the part of the<br>message from the second character to that space. This part is the username.<br>Then, it gets the actual message by taking everything after that space.</div><div><br></div><div>Next, the<br>code looks for the person who's supposed to get the message in the<br>current chat room. If that person is there, the private message is sent<br>to both the person who sent it and the person who's supposed to<br>receive it. This is done using the sendMessage method, which only sends the<br>message to the specific person it's meant for.</div><div><br></div><div>If the person who's supposed to<br>get the message isn't in the chat room, the sender gets a message<br>saying that the user with that username isn't there.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.57.02image.png.webp?alt=media&token=b066c6f9-a610-4b5b-a1ad-0410af6bb913"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the user shah muted user abul and user(abul) cant see the message<br>between shah and noyon<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T07.59.22image.png.webp?alt=media&token=7e5ab938-2273-4ece-843f-268970f6bb67"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing user(noyon) unmuted user(abul) and now can see the messages<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T08.02.15image.png.webp?alt=media&token=f563451f-fc3a-4768-bc81-a3a70de82afd"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the code snippet of server-side checking if the message starts with mute<br>or unmute<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T08.05.54image.png.webp?alt=media&token=5cbf452b-b966-4167-8282-dab7c1a04e4f"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the code snippet of Mute function<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T08.07.31image.png.webp?alt=media&token=9f79c080-0726-4aa3-aaae-309a894fe357"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the code snippet of unMute function<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-24T08.09.19image.png.webp?alt=media&token=111f7304-5fed-4ba3-b22f-df03b879d6d9"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing code snippets of Room sending message to the sender about mute and<br>unmute<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <div><br></div><div>When the chat server gets messages from clients, it checks to see if<br>the message starts with "mute" or "unmute". If it starts with "mute", the<br>server uses the processMuteCommand method. This method finds the username in the message<br>and looks for that user's ServerThread in the chat room. If the user<br>is there, their isMuted status is set to true, which means they are<br>now muted. The sender then gets a confirmation message that the user has<br>been muted. If the user isn't found in the room, the sender is<br>informed about this.</div><div><br></div><div>If the message starts with "unmute", the processUnmuteCommand method is used<br>instead. This method finds the user's ServerThread in the chat room and changes<br>their isMuted status to false, which means they are no longer muted. The<br>sender gets a message saying the user is unmuted. If the user isn't<br>in the room, the sender is told about this.</div><div><br></div><div>Both the processMuteCommand and processUnmuteCommand<br>methods use the findClientByName method to find a user's ServerThread in the room.<br>The isMuted method lets other parts of the code check if a user<br>is muted or not. The setMuted method changes the isMuted status of a<br>user's ServerThread, muting or unmuting them.</div><div><br></div><div>The sendMessage method in the Room class sends<br>messages to everyone in the chat room. It checks if a user is<br>muted before sending them a message, so muted users don't get messages. This<br>method also handles situations where a message can't be delivered to a specific<br>user, like if they've disconnected.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Hussain185/msh52-IT114-005/pull/11">https://github.com/Hussain185/msh52-IT114-005/pull/11</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone3/grade/msh52" target="_blank">Grading</a></td></tr></table>