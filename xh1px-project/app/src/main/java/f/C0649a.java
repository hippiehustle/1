package f;

import W0.c;
import Z.g;
import a.AbstractC0405a;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import a6.t;
import a6.x;
import android.content.Intent;
import android.os.Bundle;
import e.C0625a;
import e.C0632h;
import g0.T;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o6.j;
import s3.AbstractC1492c;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649a extends AbstractC0405a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10673f;

    public /* synthetic */ C0649a(int i4) {
        this.f10673f = i4;
    }

    @Override // a.AbstractC0405a
    public c Q(AbstractActivityC0870i abstractActivityC0870i, Object obj) {
        switch (this.f10673f) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new c(28, t.f7767d);
                }
                for (String str : strArr) {
                    if (AbstractC1492c.g(abstractActivityC0870i, str) != 0) {
                        return null;
                    }
                }
                int N02 = x.N0(strArr.length);
                if (N02 < 16) {
                    N02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(N02);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new c(28, linkedHashMap);
            case 1:
                if (AbstractC1492c.g(abstractActivityC0870i, (String) obj) == 0) {
                    return new c(28, Boolean.TRUE);
                }
                return null;
            default:
                return super.Q(abstractActivityC0870i, obj);
        }
    }

    @Override // a.AbstractC0405a
    public final Object i0(int i4, Intent intent) {
        boolean z8;
        switch (this.f10673f) {
            case 0:
                if (i4 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i8 : intArrayExtra) {
                            if (i8 == 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            arrayList.add(Boolean.valueOf(z8));
                        }
                        return x.R0(AbstractC0436k.X0(AbstractC0434i.V0(stringArrayExtra), arrayList));
                    }
                }
                return t.f7767d;
            case 1:
                if (intent != null && i4 == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z9 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                if (intArrayExtra2[i9] == 0) {
                                    z9 = true;
                                } else {
                                    i9++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z9);
                }
                return Boolean.FALSE;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0625a(i4, intent);
            default:
                return new C0625a(i4, intent);
        }
    }

    @Override // a.AbstractC0405a
    public final Intent s(AbstractActivityC0870i abstractActivityC0870i, Object obj) {
        Bundle bundleExtra;
        switch (this.f10673f) {
            case 0:
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
                j.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 1:
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                j.d(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                return (Intent) obj;
            default:
                C0632h c0632h = (C0632h) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0632h.f10572e;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0632h = new C0632h(c0632h.f10571d, null, c0632h.f10573f, c0632h.f10574g);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0632h);
                if (T.K(2)) {
                    intent.toString();
                }
                return intent;
        }
    }
}
