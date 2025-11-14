package e;

import a.AbstractC0405a;
import c.C0553g;
import java.util.HashMap;

/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629e extends AbstractC0627c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0405a f10565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0553g f10566d;

    public /* synthetic */ C0629e(C0553g c0553g, String str, AbstractC0405a abstractC0405a, int i4) {
        this.f10563a = i4;
        this.f10566d = c0553g;
        this.f10564b = str;
        this.f10565c = abstractC0405a;
    }

    @Override // e.AbstractC0627c
    public final void a(Object obj) {
        switch (this.f10563a) {
            case 0:
                C0553g c0553g = this.f10566d;
                HashMap hashMap = c0553g.f9320b;
                String str = this.f10564b;
                Integer num = (Integer) hashMap.get(str);
                AbstractC0405a abstractC0405a = this.f10565c;
                if (num != null) {
                    c0553g.f9322d.add(str);
                    try {
                        c0553g.b(num.intValue(), abstractC0405a, obj);
                        return;
                    } catch (Exception e9) {
                        c0553g.f9322d.remove(str);
                        throw e9;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0405a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                C0553g c0553g2 = this.f10566d;
                HashMap hashMap2 = c0553g2.f9320b;
                String str2 = this.f10564b;
                Integer num2 = (Integer) hashMap2.get(str2);
                AbstractC0405a abstractC0405a2 = this.f10565c;
                if (num2 != null) {
                    c0553g2.f9322d.add(str2);
                    try {
                        c0553g2.b(num2.intValue(), abstractC0405a2, obj);
                        return;
                    } catch (Exception e10) {
                        c0553g2.f9322d.remove(str2);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0405a2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.f10566d.f(this.f10564b);
    }
}
