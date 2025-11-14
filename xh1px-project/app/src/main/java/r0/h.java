package r0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f14249a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14250b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14251c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14252d;

    public h(int i4, int i8, long j, long j5) {
        this.f14249a = i4;
        this.f14250b = i8;
        this.f14251c = j;
        this.f14252d = j5;
    }

    public static h a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f14249a);
            dataOutputStream.writeInt(this.f14250b);
            dataOutputStream.writeLong(this.f14251c);
            dataOutputStream.writeLong(this.f14252d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f14250b == hVar.f14250b && this.f14251c == hVar.f14251c && this.f14249a == hVar.f14249a && this.f14252d == hVar.f14252d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14250b), Long.valueOf(this.f14251c), Integer.valueOf(this.f14249a), Long.valueOf(this.f14252d));
    }
}
