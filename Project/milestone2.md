<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Mohammad Hussain (msh52)</td></tr>
<tr><td> <em>Generated: </em> 11/8/2023 1:54:47 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone-2/grade/msh52" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T05.34.49image.png.webp?alt=media&token=d6e01f3f-9788-4db9-893e-08a33ba9e609"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the code for sender and message<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T05.43.58image.png.webp?alt=media&token=b9adaacb-a8c4-4571-8c4e-5b7da9869fe2"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the payload code for sender<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T06.00.19image.png.webp?alt=media&token=36e920ca-6198-4220-a476-e7be83fa9592"/></td></tr>
<tr><td> <em>Caption:</em> <p>show the sender message<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T06.03.30image.png.webp?alt=media&token=8a0754ed-4c94-4009-8fc8-9c21ce303664"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing  the code for /roll. and /flip<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T06.04.35image.png.webp?alt=media&token=69930585-5c9f-417c-925c-99499c516c44"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the code for /roll format1 and 2<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T06.05.41image.png.webp?alt=media&token=27485b33-c5fd-4369-acf5-63a85fcef08e"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the RollFormat functions<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T06.08.23image.png.webp?alt=media&token=12b27f06-56c8-47a9-bed4-79f8dfce041b"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing how flip and roll is handles from client side<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T06.17.50image.png.webp?alt=media&token=c6d5915a-cfb6-44af-bbe6-e90406391ea8"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing /roll and /flip working<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <div>/roll Command:</div><div>When a message with the /roll command is received, the Roll method<br>is invoked to handle it. The Roll method distinguishes between two possible formats<br>of the command using conditional statements:</div><div><br></div><div>Format 1: /roll 0 - X or /roll<br>1 - X</div><div>In this format, the Roll method identifies whether the command matches<br>the pattern /roll 0 - X or /roll 1 - X, where X<br>represents an upper limit for the random number generation. If a match is<br>found, the method calls RollFormat1 to process the command.</div><div><br></div><div>In RollFormat1, a random number<br>within the specified range (inclusive) is generated, where the lower bound is 0,<br>and the upper bound is X. This random number is considered the result<br>of the roll. The result message is then prepared to convey this outcome<br>to the client.</div><div><br></div><div>Format 2: /roll #d#</div><div>In this format, the Roll method checks if<br>the command matches the pattern /roll #d#, where # represents positive integer values.<br>If a match is found, the method invokes RollFormat2 to handle the command.</div><div><br></div><div>In<br>RollFormat2, the # values are extracted from the command, representing the number of<br>dice to roll and the number of sides on each die, respectively. If<br>both values are greater than zero, a result message is prepared to store<br>the results of the rolls. Random numbers are generated for each roll based<br>on the specified number of dice and sides on each die. These random<br>numbers are added to the result message, creating a list of roll outcomes.<br>Finally, the result message is broadcasted to all clients in the current room<br>using the currentRoom.broadcastMessage() function.</div><div><br></div><div>/flip Command:</div><div>When a message is received with the /flip command,<br>and the condition message.equalsIgnoreCase("/flip") is true, the server performs the Flip action. The<br>Flip action involves the following steps:</div><div><br></div><div>Generate a random decimal number between 0 and<br>1 using Math.random(). This random number represents the outcome of the coin flip.</div><div>Check<br>if the generated number is less than 0.5. If it is, the outcome<br>is considered "Heads" (0); otherwise, it's "Tails" (1).</div><div>Based on the outcome (Heads or<br>Tails), set the resultMessage accordingly.</div><div>Broadcast the resultMessage containing the outcome of the coin<br>flip to all clients in the current room using currentRoom.broadcastMessage().</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling via markdown or special characters</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T06.44.27image.png.webp?alt=media&token=210f8394-0bd4-4f91-b6cd-0896f9484eeb"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing how the bold, underline, italic and color is handles<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-11-08T06.39.39image.png.webp?alt=media&token=4a56b6d3-cb7e-4084-8bd7-be01a30c28e2"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the output working<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <div>The textStyles method enhances the appearance of a given input string by using<br>the replaceAll function to find specific patterns within the text and replace them<br>with formatted versions.</div><div><br></div><div>Bold Text:</div><div>When a message is written with double asterisks (e.g., message),<br>the replaceAll function identifies this pattern and transforms the message by encapsulating it<br>within [B] tags. This signifies that the message should be displayed in a<br>bold font.</div><div><br></div><div>Italics Text:</div><div>For italicized text, the replaceAll function detects the pattern of hyphens<br>(e.g., -message-) within the message. It then modifies the text by enclosing it<br>with [I] tags, indicating that the content should appear in italics.</div><div><br></div><div>Colored Text:</div><div>To change<br>the color of text, the replaceAll method looks for specific expressions within the<br>message. For instance, if the message contains ==red Hello==, the function transforms it<br>into [COLOR=red]Hello[/COLOR], rendering the word "Hello" in red. The same approach is applied<br>for green and blue color formatting, using ==green and ==blue respectively.</div><div><br></div><div>Underlined Text:</div><div>When the<br>message includes underlined text, identified as __message__, replaceAll alters the text by enclosing<br>it within [U] tags. This signifies that the text should be underlined.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Hussain185/msh52-IT114-005/pull/10">https://github.com/Hussain185/msh52-IT114-005/pull/10</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone-2/grade/msh52" target="_blank">Grading</a></td></tr></table>