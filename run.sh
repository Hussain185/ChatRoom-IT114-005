1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19

port=3000
if [ -n "$3" ];
then
	port="$3"
fi
if [ "$2" = "server" ];
then
	echo "port $port"
	java $1.server.Server $port
elif [ "$2" = "client" ];
then
	java $1.client.Client
    # In Milestone3 changes Client to ClientUI
elif [ "$2" = "ui" ];
then
	java $1.client.ClientUI
else
	echo "Must specify client or server"
fi

