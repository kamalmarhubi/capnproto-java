package capnp;

import java.nio.ByteBuffer;

public class Text {

    public static class Reader {
        public final ByteBuffer buffer;
        public final int offset; // in bytes
        public final int size; // in bytes

        public Reader(WordPointer ptr, int size) {
            this.buffer = ptr.buffer;
            this.offset = ptr.offset * 8;
            this.size = size;
        }

        public String toString() {
            byte[] bytes = new byte[this.size];

            // why is there no absolute get() method on ByteArray?
            for (int ii = 0; ii < this.size; ++ii) {
                bytes[ii] = this.buffer.get(this.offset + ii);
            }

            try {
                return new String(bytes, "UTF-8");
            } catch(java.io.UnsupportedEncodingException e) {
                return "unsupported encoding"; // XXX
            }
        }
    }

}
