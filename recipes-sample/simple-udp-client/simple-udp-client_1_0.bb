DESCRIPTION = "This package contains the simple UDP client program."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a194fc8d8fd1af2ed08cf252d9602023"

SECTION = "custome"

PR = "r1"

SRC_URI = "file://udp-client.c \
	   file://LICENSE \ 
          "

S = "${WORKDIR}"

do_compile() {
  ${CC} ${CFLAGS} ${LDFLAGS} udp-client.c -o udp-client
}

do_install() {
  install -d ${D}${bindir}
  install -m 0755 udp-client ${D}${bindir}
}
