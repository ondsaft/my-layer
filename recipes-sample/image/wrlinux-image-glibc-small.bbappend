display_message () {
  echo 'Welcome to THs world!' >> ${IMAGE_ROOTFS}/etc/motd
}
ROOTFS_POSTPROCESS_COMMAND += " display_message; "
