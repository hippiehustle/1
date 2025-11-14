package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class W implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8649d;

    /* renamed from: e, reason: collision with root package name */
    public int f8650e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8651f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f8652g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f8653h;

    public /* synthetic */ W(AbstractMap abstractMap, int i4) {
        this.f8649d = i4;
        this.f8653h = abstractMap;
    }

    public final Iterator a() {
        switch (this.f8649d) {
            case 0:
                if (this.f8652g == null) {
                    this.f8652g = ((U) this.f8653h).f8642e.entrySet().iterator();
                }
                return this.f8652g;
            default:
                if (this.f8652g == null) {
                    this.f8652g = ((g7.z) this.f8653h).f11270f.entrySet().iterator();
                }
                return this.f8652g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8649d) {
            case 0:
                int i4 = this.f8650e + 1;
                U u8 = (U) this.f8653h;
                if (i4 < u8.f8641d.size()) {
                    return true;
                }
                if (!u8.f8642e.isEmpty() && a().hasNext()) {
                    return true;
                }
                return false;
            default:
                if (this.f8650e + 1 < ((g7.z) this.f8653h).f11269e.size() || a().hasNext()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8649d) {
            case 0:
                this.f8651f = true;
                int i4 = this.f8650e + 1;
                this.f8650e = i4;
                U u8 = (U) this.f8653h;
                if (i4 < u8.f8641d.size()) {
                    return (Map.Entry) u8.f8641d.get(this.f8650e);
                }
                return (Map.Entry) a().next();
            default:
                this.f8651f = true;
                int i8 = this.f8650e + 1;
                this.f8650e = i8;
                g7.z zVar = (g7.z) this.f8653h;
                if (i8 < zVar.f11269e.size()) {
                    return (Map.Entry) zVar.f11269e.get(this.f8650e);
                }
                return (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i4 = this.f8649d;
        AbstractMap abstractMap = this.f8653h;
        switch (i4) {
            case 0:
                U u8 = (U) abstractMap;
                if (this.f8651f) {
                    this.f8651f = false;
                    int i8 = U.f8640i;
                    u8.b();
                    if (this.f8650e < u8.f8641d.size()) {
                        int i9 = this.f8650e;
                        this.f8650e = i9 - 1;
                        u8.h(i9);
                        return;
                    }
                    a().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
            default:
                g7.z zVar = (g7.z) abstractMap;
                if (this.f8651f) {
                    this.f8651f = false;
                    int i10 = g7.z.f11267i;
                    zVar.b();
                    if (this.f8650e < zVar.f11269e.size()) {
                        int i11 = this.f8650e;
                        this.f8650e = i11 - 1;
                        zVar.f(i11);
                        return;
                    }
                    a().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
        }
    }
}
