package g7;

import androidx.datastore.preferences.protobuf.C0468d;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final w f11259d;

    /* renamed from: e, reason: collision with root package name */
    public C0468d f11260e;

    /* renamed from: f, reason: collision with root package name */
    public int f11261f;

    public x(y yVar) {
        w wVar = new w(yVar);
        this.f11259d = wVar;
        this.f11260e = new C0468d(wVar.next());
        this.f11261f = yVar.f11262e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11261f > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f11260e.hasNext()) {
            this.f11260e = new C0468d(this.f11259d.next());
        }
        this.f11261f--;
        return Byte.valueOf(this.f11260e.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
