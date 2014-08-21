# demoniac #

Quickly connecting to Kinesis streams.

There are two routes in:
      1. An actor
      2. A future

Threre's no config yet - you're stuck with a checkpoint after every batch of messages and the default shard iterator.
See the src/main/example for a simple consumer that prints the messages it retrieves. 

It's shameless plagarism from the Amazonica Library.
