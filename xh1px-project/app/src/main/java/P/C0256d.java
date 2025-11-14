package P;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import f5.AbstractC0710a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: P.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256d implements InterfaceC0255c, InterfaceC0257e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4253d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4254e;

    /* renamed from: f, reason: collision with root package name */
    public int f4255f;

    /* renamed from: g, reason: collision with root package name */
    public int f4256g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4257h;

    /* renamed from: i, reason: collision with root package name */
    public Cloneable f4258i;

    public /* synthetic */ C0256d() {
        this.f4253d = 0;
    }

    @Override // P.InterfaceC0257e
    public ClipData a() {
        return (ClipData) this.f4254e;
    }

    public void b(t0 t0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((d0) it.next()).f4259a.c() & 8) != 0) {
                ((View) this.f4257h).setTranslationY(AbstractC0710a.c(r3.f4259a.b(), this.f4256g, 0));
                return;
            }
        }
    }

    @Override // P.InterfaceC0255c
    public C0258f build() {
        return new C0258f(new C0256d(this));
    }

    @Override // P.InterfaceC0257e
    public int c() {
        return this.f4256g;
    }

    @Override // P.InterfaceC0257e
    public ContentInfo d() {
        return null;
    }

    @Override // P.InterfaceC0255c
    public void e(Uri uri) {
        this.f4257h = uri;
    }

    @Override // P.InterfaceC0257e
    public int h() {
        return this.f4255f;
    }

    @Override // P.InterfaceC0255c
    public void i(int i4) {
        this.f4256g = i4;
    }

    @Override // P.InterfaceC0255c
    public void setExtras(Bundle bundle) {
        this.f4258i = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f4253d) {
            case 1:
                Uri uri = (Uri) this.f4257h;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f4254e).getDescription());
                sb.append(", source=");
                int i4 = this.f4255f;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 != 5) {
                                        str = String.valueOf(i4);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i8 = this.f4256g;
                if ((i8 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i8);
                }
                sb.append(valueOf);
                String str3 = "";
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (((Bundle) this.f4258i) != null) {
                    str3 = ", hasExtras";
                }
                return A.j.r(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    public C0256d(C0256d c0256d) {
        this.f4253d = 1;
        ClipData clipData = (ClipData) c0256d.f4254e;
        clipData.getClass();
        this.f4254e = clipData;
        int i4 = c0256d.f4255f;
        if (i4 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i4 <= 5) {
            this.f4255f = i4;
            int i8 = c0256d.f4256g;
            if ((i8 & 1) == i8) {
                this.f4256g = i8;
                this.f4257h = (Uri) c0256d.f4257h;
                this.f4258i = (Bundle) c0256d.f4258i;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Cloneable] */
    public C0256d(View view) {
        this.f4253d = 2;
        this.f4258i = new int[2];
        this.f4257h = view;
    }
}
