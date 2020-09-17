CC = gcc
CFLAGS = -Wall -Wextra -Werror -g
LDFLAGS = -static
PROGS = twamp-server twamp-client

all: $(PROGS)

twamp-server: twamp-server.c timestamp.c twamp.h

twamp-client: twamp-client.c timestamp.c twamp.h

setcap:
	sudo setcap 'cap_net_bind_service=+ep' ./twamp-server

indent:
	indent -linux -i4 -ts4 -nut *.c *.h

clean:
	rm -f $(PROGS)
