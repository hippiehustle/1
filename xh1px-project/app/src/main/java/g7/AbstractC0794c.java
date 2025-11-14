package g7;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: g7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0794c implements v {
    static {
        int i4 = C0799h.f11235b;
    }

    public final AbstractC0793b b(ByteArrayInputStream byteArrayInputStream, C0799h c0799h) {
        AbstractC0793b abstractC0793b;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                abstractC0793b = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i4 = 7;
                    while (true) {
                        if (i4 < 32) {
                            int read2 = byteArrayInputStream.read();
                            if (read2 != -1) {
                                read |= (read2 & 127) << i4;
                                if ((read2 & 128) == 0) {
                                    break;
                                }
                                i4 += 7;
                            } else {
                                throw InvalidProtocolBufferException.b();
                            }
                        } else {
                            while (i4 < 64) {
                                int read3 = byteArrayInputStream.read();
                                if (read3 != -1) {
                                    if ((read3 & 128) != 0) {
                                        i4 += 7;
                                    }
                                } else {
                                    throw InvalidProtocolBufferException.b();
                                }
                            }
                            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                        }
                    }
                }
                C0797f c0797f = new C0797f(new C0792a(byteArrayInputStream, read));
                AbstractC0793b abstractC0793b2 = (AbstractC0793b) a(c0797f, c0799h);
                try {
                    c0797f.a(0);
                    abstractC0793b = abstractC0793b2;
                } catch (InvalidProtocolBufferException e9) {
                    e9.f12155d = abstractC0793b2;
                    throw e9;
                }
            }
            if (abstractC0793b != null && !abstractC0793b.b()) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                invalidProtocolBufferException.f12155d = abstractC0793b;
                throw invalidProtocolBufferException;
            }
            return abstractC0793b;
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10.getMessage());
        }
    }
}
