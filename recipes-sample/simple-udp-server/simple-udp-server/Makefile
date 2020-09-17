CC = gcc
PROGS = udp-server 

all: $(PROGS)

udp-server: udp-server.c 

setcap:
	sudo setcap 'cap_net_bind_service=+ep' ./udp-server

indent:
	indent -linux -i4 -ts4 -nut *.c *.h

clean:
	rm -f $(PROGS)
