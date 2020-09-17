CC = gcc
#CFLAGS = -Wall -Wextra -Werror -g
#LDFLAGS = -static
PROGS = udp-client 

all: $(PROGS)

udp-client: udp-client.c 

setcap:
	sudo setcap 'cap_net_bind_service=+ep' ./udp-client

indent:
	indent -linux -i4 -ts4 -nut *.c *.h

clean:
	rm -f $(PROGS)
