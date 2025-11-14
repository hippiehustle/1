package g7;

import java.util.Iterator;
import java.util.Map;

/* renamed from: g7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0802k extends AbstractC0801j implements u {

    /* renamed from: e, reason: collision with root package name */
    public C0800i f11241e = C0800i.f11237c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11242f;

    public final void f(AbstractC0803l abstractC0803l) {
        z zVar;
        if (!this.f11242f) {
            this.f11241e = this.f11241e.clone();
            this.f11242f = true;
        }
        C0800i c0800i = this.f11241e;
        C0800i c0800i2 = abstractC0803l.f11243d;
        c0800i.getClass();
        int i4 = 0;
        while (true) {
            zVar = c0800i2.f11238a;
            if (i4 >= zVar.f11269e.size()) {
                break;
            }
            c0800i.g((Map.Entry) zVar.f11269e.get(i4));
            i4++;
        }
        Iterator it = zVar.c().iterator();
        while (it.hasNext()) {
            c0800i.g((Map.Entry) it.next());
        }
    }
}
