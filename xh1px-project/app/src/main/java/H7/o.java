package H7;

import L7.AbstractC0160s;
import T1.O;
import T1.u;
import Z5.y;
import a0.C0407b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.datastore.core.CorruptionException;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0620f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import k0.AbstractC0948c;
import n0.AbstractC1143u;
import n0.C1135m;
import n0.C1144v;
import n0.C1146x;
import n6.InterfaceC1163b;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2073d;

    public /* synthetic */ o(int i4) {
        this.f2073d = i4;
    }

    private final Object f(Object obj) {
        String l6;
        int i4;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Boolean bool;
        int i8;
        Integer valueOf8;
        Boolean bool2;
        Integer num;
        Integer valueOf9;
        int i9;
        int i10;
        Integer valueOf10;
        Integer num2;
        int i11;
        Integer valueOf11;
        String l8;
        String l9;
        T1.t c6;
        u e9;
        int i12;
        int i13;
        Integer valueOf12;
        String l10;
        Long valueOf13;
        int i14;
        int i15;
        Integer valueOf14;
        boolean z8;
        boolean z9;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM condition_table WHERE type='ON_IMAGE_DETECTED' AND path IS NOT NULL AND path NOT LIKE '%.png'");
        try {
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "eventId");
            int x10 = X.x(L8, "name");
            int x11 = X.x(L8, "type");
            int x12 = X.x(L8, "priority");
            int x13 = X.x(L8, "path");
            int x14 = X.x(L8, "area_left");
            int x15 = X.x(L8, "area_top");
            int x16 = X.x(L8, "area_right");
            int x17 = X.x(L8, "area_bottom");
            int x18 = X.x(L8, "threshold");
            int x19 = X.x(L8, "detection_type");
            int x20 = X.x(L8, "shouldBeDetected");
            int x21 = X.x(L8, "detection_area_left");
            int x22 = X.x(L8, "detection_area_top");
            int x23 = X.x(L8, "detection_area_right");
            int x24 = X.x(L8, "detection_area_bottom");
            int x25 = X.x(L8, "broadcast_action");
            int x26 = X.x(L8, "counter_name");
            int x27 = X.x(L8, "counter_comparison_operation");
            int x28 = X.x(L8, "counter_operation_value_type");
            int x29 = X.x(L8, "counter_value");
            int x30 = X.x(L8, "counter_value_counter_name");
            int x31 = X.x(L8, "timer_value_ms");
            int x32 = X.x(L8, "timer_restart_when_reached");
            ArrayList arrayList = new ArrayList();
            while (L8.H()) {
                long j = L8.getLong(x8);
                long j5 = L8.getLong(x9);
                String l11 = L8.l(x10);
                T1.s a3 = S1.p.a(L8.l(x11));
                int i16 = x9;
                int i17 = x10;
                int i18 = (int) L8.getLong(x12);
                Boolean bool3 = null;
                if (L8.isNull(x13)) {
                    l6 = null;
                } else {
                    l6 = L8.l(x13);
                }
                if (L8.isNull(x14)) {
                    i4 = i18;
                    valueOf = null;
                } else {
                    i4 = i18;
                    valueOf = Integer.valueOf((int) L8.getLong(x14));
                }
                if (L8.isNull(x15)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                }
                if (L8.isNull(x16)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf((int) L8.getLong(x16));
                }
                if (L8.isNull(x17)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Integer.valueOf((int) L8.getLong(x17));
                }
                if (L8.isNull(x18)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Integer.valueOf((int) L8.getLong(x18));
                }
                if (L8.isNull(x19)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Integer.valueOf((int) L8.getLong(x19));
                }
                if (L8.isNull(x20)) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Integer.valueOf((int) L8.getLong(x20));
                }
                if (valueOf7 != null) {
                    if (valueOf7.intValue() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bool = Boolean.valueOf(z9);
                } else {
                    bool = null;
                }
                if (L8.isNull(x21)) {
                    i8 = x11;
                    valueOf8 = null;
                } else {
                    i8 = x11;
                    valueOf8 = Integer.valueOf((int) L8.getLong(x21));
                }
                int i19 = x22;
                if (L8.isNull(i19)) {
                    bool2 = bool;
                    num = valueOf8;
                    valueOf9 = null;
                } else {
                    bool2 = bool;
                    num = valueOf8;
                    valueOf9 = Integer.valueOf((int) L8.getLong(i19));
                }
                int i20 = x23;
                if (L8.isNull(i20)) {
                    i9 = i19;
                    i10 = x12;
                    valueOf10 = null;
                } else {
                    i9 = i19;
                    i10 = x12;
                    valueOf10 = Integer.valueOf((int) L8.getLong(i20));
                }
                int i21 = x24;
                if (L8.isNull(i21)) {
                    num2 = valueOf9;
                    i11 = i20;
                    valueOf11 = null;
                } else {
                    num2 = valueOf9;
                    i11 = i20;
                    valueOf11 = Integer.valueOf((int) L8.getLong(i21));
                }
                int i22 = x25;
                if (L8.isNull(i22)) {
                    l8 = null;
                } else {
                    l8 = L8.l(i22);
                }
                int i23 = x26;
                if (L8.isNull(i23)) {
                    l9 = null;
                } else {
                    l9 = L8.l(i23);
                }
                int i24 = x8;
                int i25 = x27;
                if (L8.isNull(i25)) {
                    c6 = null;
                } else {
                    c6 = S1.p.c(L8.l(i25));
                }
                x27 = i25;
                int i26 = x28;
                if (L8.isNull(i26)) {
                    e9 = null;
                } else {
                    e9 = S1.p.e(L8.l(i26));
                }
                x28 = i26;
                int i27 = x29;
                if (L8.isNull(i27)) {
                    i12 = i22;
                    i13 = i23;
                    valueOf12 = null;
                } else {
                    i12 = i22;
                    i13 = i23;
                    valueOf12 = Integer.valueOf((int) L8.getLong(i27));
                }
                int i28 = x30;
                if (L8.isNull(i28)) {
                    l10 = null;
                } else {
                    l10 = L8.l(i28);
                }
                int i29 = x31;
                if (L8.isNull(i29)) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Long.valueOf(L8.getLong(i29));
                }
                int i30 = x32;
                if (L8.isNull(i30)) {
                    i14 = i28;
                    i15 = i29;
                    valueOf14 = null;
                } else {
                    i14 = i28;
                    i15 = i29;
                    valueOf14 = Integer.valueOf((int) L8.getLong(i30));
                }
                if (valueOf14 != null) {
                    if (valueOf14.intValue() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    bool3 = Boolean.valueOf(z8);
                }
                arrayList.add(new T1.r(j, j5, l11, a3, i4, l6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool2, num, num2, valueOf10, valueOf11, l8, l9, c6, e9, valueOf12, l10, valueOf13, bool3));
                int i31 = i15;
                x32 = i30;
                x8 = i24;
                x25 = i12;
                x26 = i13;
                x29 = i27;
                x30 = i14;
                x31 = i31;
                x12 = i10;
                x23 = i11;
                x9 = i16;
                x10 = i17;
                x22 = i9;
                x24 = i21;
                x11 = i8;
            }
            L8.close();
            return arrayList;
        } catch (Throwable th) {
            L8.close();
            throw th;
        }
    }

    private final Object g(Object obj) {
        String l6;
        int i4;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Boolean bool;
        int i8;
        Integer valueOf8;
        Boolean bool2;
        Integer num;
        Integer valueOf9;
        int i9;
        int i10;
        Integer valueOf10;
        Integer num2;
        int i11;
        Integer valueOf11;
        String l8;
        String l9;
        T1.t d2;
        u f8;
        int i12;
        int i13;
        Integer valueOf12;
        String l10;
        Long valueOf13;
        int i14;
        int i15;
        Integer valueOf14;
        boolean z8;
        boolean z9;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM condition_table");
        try {
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "eventId");
            int x10 = X.x(L8, "name");
            int x11 = X.x(L8, "type");
            int x12 = X.x(L8, "priority");
            int x13 = X.x(L8, "path");
            int x14 = X.x(L8, "area_left");
            int x15 = X.x(L8, "area_top");
            int x16 = X.x(L8, "area_right");
            int x17 = X.x(L8, "area_bottom");
            int x18 = X.x(L8, "threshold");
            int x19 = X.x(L8, "detection_type");
            int x20 = X.x(L8, "shouldBeDetected");
            int x21 = X.x(L8, "detection_area_left");
            int x22 = X.x(L8, "detection_area_top");
            int x23 = X.x(L8, "detection_area_right");
            int x24 = X.x(L8, "detection_area_bottom");
            int x25 = X.x(L8, "broadcast_action");
            int x26 = X.x(L8, "counter_name");
            int x27 = X.x(L8, "counter_comparison_operation");
            int x28 = X.x(L8, "counter_operation_value_type");
            int x29 = X.x(L8, "counter_value");
            int x30 = X.x(L8, "counter_value_counter_name");
            int x31 = X.x(L8, "timer_value_ms");
            int x32 = X.x(L8, "timer_restart_when_reached");
            ArrayList arrayList = new ArrayList();
            while (L8.H()) {
                long j = L8.getLong(x8);
                long j5 = L8.getLong(x9);
                String l11 = L8.l(x10);
                T1.s b4 = S1.p.b(L8.l(x11));
                int i16 = x9;
                int i17 = x10;
                int i18 = (int) L8.getLong(x12);
                Boolean bool3 = null;
                if (L8.isNull(x13)) {
                    l6 = null;
                } else {
                    l6 = L8.l(x13);
                }
                if (L8.isNull(x14)) {
                    i4 = i18;
                    valueOf = null;
                } else {
                    i4 = i18;
                    valueOf = Integer.valueOf((int) L8.getLong(x14));
                }
                if (L8.isNull(x15)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                }
                if (L8.isNull(x16)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf((int) L8.getLong(x16));
                }
                if (L8.isNull(x17)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Integer.valueOf((int) L8.getLong(x17));
                }
                if (L8.isNull(x18)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Integer.valueOf((int) L8.getLong(x18));
                }
                if (L8.isNull(x19)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Integer.valueOf((int) L8.getLong(x19));
                }
                if (L8.isNull(x20)) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Integer.valueOf((int) L8.getLong(x20));
                }
                if (valueOf7 != null) {
                    if (valueOf7.intValue() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bool = Boolean.valueOf(z9);
                } else {
                    bool = null;
                }
                if (L8.isNull(x21)) {
                    i8 = x11;
                    valueOf8 = null;
                } else {
                    i8 = x11;
                    valueOf8 = Integer.valueOf((int) L8.getLong(x21));
                }
                int i19 = x22;
                if (L8.isNull(i19)) {
                    bool2 = bool;
                    num = valueOf8;
                    valueOf9 = null;
                } else {
                    bool2 = bool;
                    num = valueOf8;
                    valueOf9 = Integer.valueOf((int) L8.getLong(i19));
                }
                int i20 = x23;
                if (L8.isNull(i20)) {
                    i9 = i19;
                    i10 = x12;
                    valueOf10 = null;
                } else {
                    i9 = i19;
                    i10 = x12;
                    valueOf10 = Integer.valueOf((int) L8.getLong(i20));
                }
                int i21 = x24;
                if (L8.isNull(i21)) {
                    num2 = valueOf9;
                    i11 = i20;
                    valueOf11 = null;
                } else {
                    num2 = valueOf9;
                    i11 = i20;
                    valueOf11 = Integer.valueOf((int) L8.getLong(i21));
                }
                int i22 = x25;
                if (L8.isNull(i22)) {
                    l8 = null;
                } else {
                    l8 = L8.l(i22);
                }
                int i23 = x26;
                if (L8.isNull(i23)) {
                    l9 = null;
                } else {
                    l9 = L8.l(i23);
                }
                int i24 = x8;
                int i25 = x27;
                if (L8.isNull(i25)) {
                    d2 = null;
                } else {
                    d2 = S1.p.d(L8.l(i25));
                }
                x27 = i25;
                int i26 = x28;
                if (L8.isNull(i26)) {
                    f8 = null;
                } else {
                    f8 = S1.p.f(L8.l(i26));
                }
                x28 = i26;
                int i27 = x29;
                if (L8.isNull(i27)) {
                    i12 = i22;
                    i13 = i23;
                    valueOf12 = null;
                } else {
                    i12 = i22;
                    i13 = i23;
                    valueOf12 = Integer.valueOf((int) L8.getLong(i27));
                }
                int i28 = x30;
                if (L8.isNull(i28)) {
                    l10 = null;
                } else {
                    l10 = L8.l(i28);
                }
                int i29 = x31;
                if (L8.isNull(i29)) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Long.valueOf(L8.getLong(i29));
                }
                int i30 = x32;
                if (L8.isNull(i30)) {
                    i14 = i28;
                    i15 = i29;
                    valueOf14 = null;
                } else {
                    i14 = i28;
                    i15 = i29;
                    valueOf14 = Integer.valueOf((int) L8.getLong(i30));
                }
                if (valueOf14 != null) {
                    if (valueOf14.intValue() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    bool3 = Boolean.valueOf(z8);
                }
                arrayList.add(new T1.r(j, j5, l11, b4, i4, l6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool2, num, num2, valueOf10, valueOf11, l8, l9, d2, f8, valueOf12, l10, valueOf13, bool3));
                int i31 = i15;
                x32 = i30;
                x8 = i24;
                x25 = i12;
                x26 = i13;
                x29 = i27;
                x30 = i14;
                x31 = i31;
                x12 = i10;
                x23 = i11;
                x9 = i16;
                x10 = i17;
                x22 = i9;
                x24 = i21;
                x11 = i8;
            }
            L8.close();
            return arrayList;
        } catch (Throwable th) {
            L8.close();
            throw th;
        }
    }

    private final Object h(Object obj) {
        String l6;
        int i4;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Boolean bool;
        int i8;
        Integer valueOf8;
        Boolean bool2;
        Integer num;
        Integer valueOf9;
        int i9;
        int i10;
        Integer valueOf10;
        Integer num2;
        int i11;
        Integer valueOf11;
        String l8;
        String l9;
        T1.t d2;
        u f8;
        int i12;
        int i13;
        Integer valueOf12;
        String l10;
        Long valueOf13;
        int i14;
        int i15;
        Integer valueOf14;
        boolean z8;
        boolean z9;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM condition_table WHERE type='ON_IMAGE_DETECTED' AND path IS NOT NULL AND path NOT LIKE '%.png'");
        try {
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "eventId");
            int x10 = X.x(L8, "name");
            int x11 = X.x(L8, "type");
            int x12 = X.x(L8, "priority");
            int x13 = X.x(L8, "path");
            int x14 = X.x(L8, "area_left");
            int x15 = X.x(L8, "area_top");
            int x16 = X.x(L8, "area_right");
            int x17 = X.x(L8, "area_bottom");
            int x18 = X.x(L8, "threshold");
            int x19 = X.x(L8, "detection_type");
            int x20 = X.x(L8, "shouldBeDetected");
            int x21 = X.x(L8, "detection_area_left");
            int x22 = X.x(L8, "detection_area_top");
            int x23 = X.x(L8, "detection_area_right");
            int x24 = X.x(L8, "detection_area_bottom");
            int x25 = X.x(L8, "broadcast_action");
            int x26 = X.x(L8, "counter_name");
            int x27 = X.x(L8, "counter_comparison_operation");
            int x28 = X.x(L8, "counter_operation_value_type");
            int x29 = X.x(L8, "counter_value");
            int x30 = X.x(L8, "counter_value_counter_name");
            int x31 = X.x(L8, "timer_value_ms");
            int x32 = X.x(L8, "timer_restart_when_reached");
            ArrayList arrayList = new ArrayList();
            while (L8.H()) {
                long j = L8.getLong(x8);
                long j5 = L8.getLong(x9);
                String l11 = L8.l(x10);
                T1.s b4 = S1.p.b(L8.l(x11));
                int i16 = x9;
                int i17 = x10;
                int i18 = (int) L8.getLong(x12);
                Boolean bool3 = null;
                if (L8.isNull(x13)) {
                    l6 = null;
                } else {
                    l6 = L8.l(x13);
                }
                if (L8.isNull(x14)) {
                    i4 = i18;
                    valueOf = null;
                } else {
                    i4 = i18;
                    valueOf = Integer.valueOf((int) L8.getLong(x14));
                }
                if (L8.isNull(x15)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                }
                if (L8.isNull(x16)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf((int) L8.getLong(x16));
                }
                if (L8.isNull(x17)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Integer.valueOf((int) L8.getLong(x17));
                }
                if (L8.isNull(x18)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Integer.valueOf((int) L8.getLong(x18));
                }
                if (L8.isNull(x19)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Integer.valueOf((int) L8.getLong(x19));
                }
                if (L8.isNull(x20)) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Integer.valueOf((int) L8.getLong(x20));
                }
                if (valueOf7 != null) {
                    if (valueOf7.intValue() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bool = Boolean.valueOf(z9);
                } else {
                    bool = null;
                }
                if (L8.isNull(x21)) {
                    i8 = x11;
                    valueOf8 = null;
                } else {
                    i8 = x11;
                    valueOf8 = Integer.valueOf((int) L8.getLong(x21));
                }
                int i19 = x22;
                if (L8.isNull(i19)) {
                    bool2 = bool;
                    num = valueOf8;
                    valueOf9 = null;
                } else {
                    bool2 = bool;
                    num = valueOf8;
                    valueOf9 = Integer.valueOf((int) L8.getLong(i19));
                }
                int i20 = x23;
                if (L8.isNull(i20)) {
                    i9 = i19;
                    i10 = x12;
                    valueOf10 = null;
                } else {
                    i9 = i19;
                    i10 = x12;
                    valueOf10 = Integer.valueOf((int) L8.getLong(i20));
                }
                int i21 = x24;
                if (L8.isNull(i21)) {
                    num2 = valueOf9;
                    i11 = i20;
                    valueOf11 = null;
                } else {
                    num2 = valueOf9;
                    i11 = i20;
                    valueOf11 = Integer.valueOf((int) L8.getLong(i21));
                }
                int i22 = x25;
                if (L8.isNull(i22)) {
                    l8 = null;
                } else {
                    l8 = L8.l(i22);
                }
                int i23 = x26;
                if (L8.isNull(i23)) {
                    l9 = null;
                } else {
                    l9 = L8.l(i23);
                }
                int i24 = x8;
                int i25 = x27;
                if (L8.isNull(i25)) {
                    d2 = null;
                } else {
                    d2 = S1.p.d(L8.l(i25));
                }
                x27 = i25;
                int i26 = x28;
                if (L8.isNull(i26)) {
                    f8 = null;
                } else {
                    f8 = S1.p.f(L8.l(i26));
                }
                x28 = i26;
                int i27 = x29;
                if (L8.isNull(i27)) {
                    i12 = i22;
                    i13 = i23;
                    valueOf12 = null;
                } else {
                    i12 = i22;
                    i13 = i23;
                    valueOf12 = Integer.valueOf((int) L8.getLong(i27));
                }
                int i28 = x30;
                if (L8.isNull(i28)) {
                    l10 = null;
                } else {
                    l10 = L8.l(i28);
                }
                int i29 = x31;
                if (L8.isNull(i29)) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Long.valueOf(L8.getLong(i29));
                }
                int i30 = x32;
                if (L8.isNull(i30)) {
                    i14 = i28;
                    i15 = i29;
                    valueOf14 = null;
                } else {
                    i14 = i28;
                    i15 = i29;
                    valueOf14 = Integer.valueOf((int) L8.getLong(i30));
                }
                if (valueOf14 != null) {
                    if (valueOf14.intValue() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    bool3 = Boolean.valueOf(z8);
                }
                arrayList.add(new T1.r(j, j5, l11, b4, i4, l6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool2, num, num2, valueOf10, valueOf11, l8, l9, d2, f8, valueOf12, l10, valueOf13, bool3));
                int i31 = i15;
                x32 = i30;
                x8 = i24;
                x25 = i12;
                x26 = i13;
                x29 = i27;
                x30 = i14;
                x31 = i31;
                x12 = i10;
                x23 = i11;
                x9 = i16;
                x10 = i17;
                x22 = i9;
                x24 = i21;
                x11 = i8;
            }
            L8.close();
            return arrayList;
        } catch (Throwable th) {
            L8.close();
            throw th;
        }
    }

    private final Object k(Object obj) {
        String l6;
        int i4;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Boolean bool;
        int i8;
        Integer valueOf8;
        Boolean bool2;
        Integer num;
        Integer valueOf9;
        int i9;
        int i10;
        Integer valueOf10;
        Integer num2;
        int i11;
        Integer valueOf11;
        String l8;
        String l9;
        T1.t d2;
        u f8;
        int i12;
        int i13;
        Integer valueOf12;
        String l10;
        Long valueOf13;
        int i14;
        int i15;
        Integer valueOf14;
        boolean z8;
        boolean z9;
        D0.a aVar = (D0.a) obj;
        o6.j.e(aVar, "_connection");
        D0.c L8 = aVar.L("SELECT * FROM condition_table WHERE type='ON_IMAGE_DETECTED' AND path IS NOT NULL AND path NOT LIKE '%.png'");
        try {
            int x8 = X.x(L8, "id");
            int x9 = X.x(L8, "eventId");
            int x10 = X.x(L8, "name");
            int x11 = X.x(L8, "type");
            int x12 = X.x(L8, "priority");
            int x13 = X.x(L8, "path");
            int x14 = X.x(L8, "area_left");
            int x15 = X.x(L8, "area_top");
            int x16 = X.x(L8, "area_right");
            int x17 = X.x(L8, "area_bottom");
            int x18 = X.x(L8, "threshold");
            int x19 = X.x(L8, "detection_type");
            int x20 = X.x(L8, "shouldBeDetected");
            int x21 = X.x(L8, "detection_area_left");
            int x22 = X.x(L8, "detection_area_top");
            int x23 = X.x(L8, "detection_area_right");
            int x24 = X.x(L8, "detection_area_bottom");
            int x25 = X.x(L8, "broadcast_action");
            int x26 = X.x(L8, "counter_name");
            int x27 = X.x(L8, "counter_comparison_operation");
            int x28 = X.x(L8, "counter_operation_value_type");
            int x29 = X.x(L8, "counter_value");
            int x30 = X.x(L8, "counter_value_counter_name");
            int x31 = X.x(L8, "timer_value_ms");
            int x32 = X.x(L8, "timer_restart_when_reached");
            ArrayList arrayList = new ArrayList();
            while (L8.H()) {
                long j = L8.getLong(x8);
                long j5 = L8.getLong(x9);
                String l11 = L8.l(x10);
                T1.s b4 = S1.p.b(L8.l(x11));
                int i16 = x9;
                int i17 = x10;
                int i18 = (int) L8.getLong(x12);
                Boolean bool3 = null;
                if (L8.isNull(x13)) {
                    l6 = null;
                } else {
                    l6 = L8.l(x13);
                }
                if (L8.isNull(x14)) {
                    i4 = i18;
                    valueOf = null;
                } else {
                    i4 = i18;
                    valueOf = Integer.valueOf((int) L8.getLong(x14));
                }
                if (L8.isNull(x15)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                }
                if (L8.isNull(x16)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf((int) L8.getLong(x16));
                }
                if (L8.isNull(x17)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Integer.valueOf((int) L8.getLong(x17));
                }
                if (L8.isNull(x18)) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Integer.valueOf((int) L8.getLong(x18));
                }
                if (L8.isNull(x19)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Integer.valueOf((int) L8.getLong(x19));
                }
                if (L8.isNull(x20)) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Integer.valueOf((int) L8.getLong(x20));
                }
                if (valueOf7 != null) {
                    if (valueOf7.intValue() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bool = Boolean.valueOf(z9);
                } else {
                    bool = null;
                }
                if (L8.isNull(x21)) {
                    i8 = x11;
                    valueOf8 = null;
                } else {
                    i8 = x11;
                    valueOf8 = Integer.valueOf((int) L8.getLong(x21));
                }
                int i19 = x22;
                if (L8.isNull(i19)) {
                    bool2 = bool;
                    num = valueOf8;
                    valueOf9 = null;
                } else {
                    bool2 = bool;
                    num = valueOf8;
                    valueOf9 = Integer.valueOf((int) L8.getLong(i19));
                }
                int i20 = x23;
                if (L8.isNull(i20)) {
                    i9 = i19;
                    i10 = x12;
                    valueOf10 = null;
                } else {
                    i9 = i19;
                    i10 = x12;
                    valueOf10 = Integer.valueOf((int) L8.getLong(i20));
                }
                int i21 = x24;
                if (L8.isNull(i21)) {
                    num2 = valueOf9;
                    i11 = i20;
                    valueOf11 = null;
                } else {
                    num2 = valueOf9;
                    i11 = i20;
                    valueOf11 = Integer.valueOf((int) L8.getLong(i21));
                }
                int i22 = x25;
                if (L8.isNull(i22)) {
                    l8 = null;
                } else {
                    l8 = L8.l(i22);
                }
                int i23 = x26;
                if (L8.isNull(i23)) {
                    l9 = null;
                } else {
                    l9 = L8.l(i23);
                }
                int i24 = x8;
                int i25 = x27;
                if (L8.isNull(i25)) {
                    d2 = null;
                } else {
                    d2 = S1.p.d(L8.l(i25));
                }
                x27 = i25;
                int i26 = x28;
                if (L8.isNull(i26)) {
                    f8 = null;
                } else {
                    f8 = S1.p.f(L8.l(i26));
                }
                x28 = i26;
                int i27 = x29;
                if (L8.isNull(i27)) {
                    i12 = i22;
                    i13 = i23;
                    valueOf12 = null;
                } else {
                    i12 = i22;
                    i13 = i23;
                    valueOf12 = Integer.valueOf((int) L8.getLong(i27));
                }
                int i28 = x30;
                if (L8.isNull(i28)) {
                    l10 = null;
                } else {
                    l10 = L8.l(i28);
                }
                int i29 = x31;
                if (L8.isNull(i29)) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Long.valueOf(L8.getLong(i29));
                }
                int i30 = x32;
                if (L8.isNull(i30)) {
                    i14 = i28;
                    i15 = i29;
                    valueOf14 = null;
                } else {
                    i14 = i28;
                    i15 = i29;
                    valueOf14 = Integer.valueOf((int) L8.getLong(i30));
                }
                if (valueOf14 != null) {
                    if (valueOf14.intValue() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    bool3 = Boolean.valueOf(z8);
                }
                arrayList.add(new T1.r(j, j5, l11, b4, i4, l6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool2, num, num2, valueOf10, valueOf11, l8, l9, d2, f8, valueOf12, l10, valueOf13, bool3));
                int i31 = i15;
                x32 = i30;
                x8 = i24;
                x25 = i12;
                x26 = i13;
                x29 = i27;
                x30 = i14;
                x31 = i31;
                x12 = i10;
                x23 = i11;
                x9 = i16;
                x10 = i17;
                x22 = i9;
                x24 = i21;
                x11 = i8;
            }
            L8.close();
            return arrayList;
        } catch (Throwable th) {
            L8.close();
            throw th;
        }
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        D0.c L8;
        String l6;
        int i4;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        Integer valueOf7;
        Boolean bool;
        int i8;
        Integer valueOf8;
        Boolean bool2;
        Integer num;
        Integer valueOf9;
        int i9;
        int i10;
        Integer valueOf10;
        Integer num2;
        int i11;
        Integer valueOf11;
        String l8;
        String l9;
        T1.t c6;
        u e9;
        int i12;
        int i13;
        Integer valueOf12;
        String l10;
        Long valueOf13;
        int i14;
        int i15;
        Integer valueOf14;
        boolean z15;
        boolean z16;
        String l11;
        int i16;
        Integer valueOf15;
        Integer valueOf16;
        Integer valueOf17;
        Integer valueOf18;
        Integer valueOf19;
        Integer valueOf20;
        Integer valueOf21;
        Boolean bool3;
        int i17;
        Integer valueOf22;
        Boolean bool4;
        Integer num3;
        Integer valueOf23;
        int i18;
        int i19;
        Integer valueOf24;
        Integer num4;
        int i20;
        Integer valueOf25;
        String l12;
        String l13;
        T1.t c9;
        u e10;
        int i21;
        int i22;
        Integer valueOf26;
        String l14;
        Long valueOf27;
        int i23;
        int i24;
        Integer valueOf28;
        boolean z17;
        boolean z18;
        ContextWrapper contextWrapper;
        switch (this.f2073d) {
            case 0:
                k kVar = (k) obj;
                o6.j.e(kVar, "it");
                return kVar.iterator();
            case 1:
                return obj;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (obj == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (((Character) obj).charValue() == '-') {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (((Character) obj).charValue() == '-') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    z11 = false;
                } else {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (((Character) obj).charValue() == ':') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (((Character) obj).charValue() == ':') {
                    z13 = true;
                } else {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                char charValue2 = ((Character) obj).charValue();
                if ('0' <= charValue2 && charValue2 < ':') {
                    z14 = true;
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 9:
                InterfaceC0620f interfaceC0620f = (InterfaceC0620f) obj;
                if (interfaceC0620f instanceof AbstractC0160s) {
                    return (AbstractC0160s) interfaceC0620f;
                }
                return null;
            case 10:
                return 1000L;
            case 11:
                D0.a aVar = (D0.a) obj;
                o6.j.e(aVar, "_connection");
                L8 = aVar.L("SELECT * FROM condition_table WHERE type='ON_IMAGE_DETECTED' AND path IS NOT NULL AND path NOT LIKE '%.png'");
                try {
                    int x8 = X.x(L8, "id");
                    int x9 = X.x(L8, "eventId");
                    int x10 = X.x(L8, "name");
                    int x11 = X.x(L8, "type");
                    int x12 = X.x(L8, "priority");
                    int x13 = X.x(L8, "path");
                    int x14 = X.x(L8, "area_left");
                    int x15 = X.x(L8, "area_top");
                    int x16 = X.x(L8, "area_right");
                    int x17 = X.x(L8, "area_bottom");
                    int x18 = X.x(L8, "threshold");
                    int x19 = X.x(L8, "detection_type");
                    int x20 = X.x(L8, "shouldBeDetected");
                    int x21 = X.x(L8, "detection_area_left");
                    int x22 = X.x(L8, "detection_area_top");
                    int x23 = X.x(L8, "detection_area_right");
                    int x24 = X.x(L8, "detection_area_bottom");
                    int x25 = X.x(L8, "broadcast_action");
                    int x26 = X.x(L8, "counter_name");
                    int x27 = X.x(L8, "counter_comparison_operation");
                    int x28 = X.x(L8, "counter_operation_value_type");
                    int x29 = X.x(L8, "counter_value");
                    int x30 = X.x(L8, "counter_value_counter_name");
                    int x31 = X.x(L8, "timer_value_ms");
                    int x32 = X.x(L8, "timer_restart_when_reached");
                    ArrayList arrayList = new ArrayList();
                    while (L8.H()) {
                        long j = L8.getLong(x8);
                        long j5 = L8.getLong(x9);
                        String l15 = L8.l(x10);
                        T1.s a3 = S1.p.a(L8.l(x11));
                        int i25 = x9;
                        int i26 = x10;
                        int i27 = (int) L8.getLong(x12);
                        Boolean bool5 = null;
                        if (L8.isNull(x13)) {
                            l6 = null;
                        } else {
                            l6 = L8.l(x13);
                        }
                        if (L8.isNull(x14)) {
                            i4 = i27;
                            valueOf = null;
                        } else {
                            i4 = i27;
                            valueOf = Integer.valueOf((int) L8.getLong(x14));
                        }
                        if (L8.isNull(x15)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Integer.valueOf((int) L8.getLong(x15));
                        }
                        if (L8.isNull(x16)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Integer.valueOf((int) L8.getLong(x16));
                        }
                        if (L8.isNull(x17)) {
                            valueOf4 = null;
                        } else {
                            valueOf4 = Integer.valueOf((int) L8.getLong(x17));
                        }
                        if (L8.isNull(x18)) {
                            valueOf5 = null;
                        } else {
                            valueOf5 = Integer.valueOf((int) L8.getLong(x18));
                        }
                        if (L8.isNull(x19)) {
                            valueOf6 = null;
                        } else {
                            valueOf6 = Integer.valueOf((int) L8.getLong(x19));
                        }
                        if (L8.isNull(x20)) {
                            valueOf7 = null;
                        } else {
                            valueOf7 = Integer.valueOf((int) L8.getLong(x20));
                        }
                        if (valueOf7 != null) {
                            if (valueOf7.intValue() != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            bool = Boolean.valueOf(z16);
                        } else {
                            bool = null;
                        }
                        if (L8.isNull(x21)) {
                            i8 = x11;
                            valueOf8 = null;
                        } else {
                            i8 = x11;
                            valueOf8 = Integer.valueOf((int) L8.getLong(x21));
                        }
                        int i28 = x22;
                        if (L8.isNull(i28)) {
                            bool2 = bool;
                            num = valueOf8;
                            valueOf9 = null;
                        } else {
                            bool2 = bool;
                            num = valueOf8;
                            valueOf9 = Integer.valueOf((int) L8.getLong(i28));
                        }
                        int i29 = x23;
                        if (L8.isNull(i29)) {
                            i9 = i28;
                            i10 = x12;
                            valueOf10 = null;
                        } else {
                            i9 = i28;
                            i10 = x12;
                            valueOf10 = Integer.valueOf((int) L8.getLong(i29));
                        }
                        int i30 = x24;
                        if (L8.isNull(i30)) {
                            num2 = valueOf9;
                            i11 = i29;
                            valueOf11 = null;
                        } else {
                            num2 = valueOf9;
                            i11 = i29;
                            valueOf11 = Integer.valueOf((int) L8.getLong(i30));
                        }
                        int i31 = x25;
                        if (L8.isNull(i31)) {
                            l8 = null;
                        } else {
                            l8 = L8.l(i31);
                        }
                        int i32 = x26;
                        if (L8.isNull(i32)) {
                            l9 = null;
                        } else {
                            l9 = L8.l(i32);
                        }
                        int i33 = x8;
                        int i34 = x27;
                        if (L8.isNull(i34)) {
                            c6 = null;
                        } else {
                            c6 = S1.p.c(L8.l(i34));
                        }
                        x27 = i34;
                        int i35 = x28;
                        if (L8.isNull(i35)) {
                            e9 = null;
                        } else {
                            e9 = S1.p.e(L8.l(i35));
                        }
                        x28 = i35;
                        int i36 = x29;
                        if (L8.isNull(i36)) {
                            i12 = i31;
                            i13 = i32;
                            valueOf12 = null;
                        } else {
                            i12 = i31;
                            i13 = i32;
                            valueOf12 = Integer.valueOf((int) L8.getLong(i36));
                        }
                        int i37 = x30;
                        if (L8.isNull(i37)) {
                            l10 = null;
                        } else {
                            l10 = L8.l(i37);
                        }
                        int i38 = x31;
                        if (L8.isNull(i38)) {
                            valueOf13 = null;
                        } else {
                            valueOf13 = Long.valueOf(L8.getLong(i38));
                        }
                        int i39 = x32;
                        if (L8.isNull(i39)) {
                            i14 = i37;
                            i15 = i38;
                            valueOf14 = null;
                        } else {
                            i14 = i37;
                            i15 = i38;
                            valueOf14 = Integer.valueOf((int) L8.getLong(i39));
                        }
                        if (valueOf14 != null) {
                            if (valueOf14.intValue() != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            bool5 = Boolean.valueOf(z15);
                        }
                        arrayList.add(new T1.r(j, j5, l15, a3, i4, l6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool2, num, num2, valueOf10, valueOf11, l8, l9, c6, e9, valueOf12, l10, valueOf13, bool5));
                        int i40 = i15;
                        x32 = i39;
                        x8 = i33;
                        x25 = i12;
                        x26 = i13;
                        x29 = i36;
                        x30 = i14;
                        x31 = i40;
                        x12 = i10;
                        x23 = i11;
                        x9 = i25;
                        x10 = i26;
                        x22 = i9;
                        x24 = i30;
                        x11 = i8;
                    }
                    return arrayList;
                } finally {
                }
            case 12:
                D0.a aVar2 = (D0.a) obj;
                o6.j.e(aVar2, "_connection");
                L8 = aVar2.L("SELECT * FROM condition_table");
                try {
                    int x33 = X.x(L8, "id");
                    int x34 = X.x(L8, "eventId");
                    int x35 = X.x(L8, "name");
                    int x36 = X.x(L8, "type");
                    int x37 = X.x(L8, "priority");
                    int x38 = X.x(L8, "path");
                    int x39 = X.x(L8, "area_left");
                    int x40 = X.x(L8, "area_top");
                    int x41 = X.x(L8, "area_right");
                    int x42 = X.x(L8, "area_bottom");
                    int x43 = X.x(L8, "threshold");
                    int x44 = X.x(L8, "detection_type");
                    int x45 = X.x(L8, "shouldBeDetected");
                    int x46 = X.x(L8, "detection_area_left");
                    int x47 = X.x(L8, "detection_area_top");
                    int x48 = X.x(L8, "detection_area_right");
                    int x49 = X.x(L8, "detection_area_bottom");
                    int x50 = X.x(L8, "broadcast_action");
                    int x51 = X.x(L8, "counter_name");
                    int x52 = X.x(L8, "counter_comparison_operation");
                    int x53 = X.x(L8, "counter_operation_value_type");
                    int x54 = X.x(L8, "counter_value");
                    int x55 = X.x(L8, "counter_value_counter_name");
                    int x56 = X.x(L8, "timer_value_ms");
                    int x57 = X.x(L8, "timer_restart_when_reached");
                    ArrayList arrayList2 = new ArrayList();
                    while (L8.H()) {
                        long j8 = L8.getLong(x33);
                        long j9 = L8.getLong(x34);
                        String l16 = L8.l(x35);
                        T1.s a4 = S1.p.a(L8.l(x36));
                        int i41 = x34;
                        int i42 = x35;
                        int i43 = (int) L8.getLong(x37);
                        Boolean bool6 = null;
                        if (L8.isNull(x38)) {
                            l11 = null;
                        } else {
                            l11 = L8.l(x38);
                        }
                        if (L8.isNull(x39)) {
                            i16 = i43;
                            valueOf15 = null;
                        } else {
                            i16 = i43;
                            valueOf15 = Integer.valueOf((int) L8.getLong(x39));
                        }
                        if (L8.isNull(x40)) {
                            valueOf16 = null;
                        } else {
                            valueOf16 = Integer.valueOf((int) L8.getLong(x40));
                        }
                        if (L8.isNull(x41)) {
                            valueOf17 = null;
                        } else {
                            valueOf17 = Integer.valueOf((int) L8.getLong(x41));
                        }
                        if (L8.isNull(x42)) {
                            valueOf18 = null;
                        } else {
                            valueOf18 = Integer.valueOf((int) L8.getLong(x42));
                        }
                        if (L8.isNull(x43)) {
                            valueOf19 = null;
                        } else {
                            valueOf19 = Integer.valueOf((int) L8.getLong(x43));
                        }
                        if (L8.isNull(x44)) {
                            valueOf20 = null;
                        } else {
                            valueOf20 = Integer.valueOf((int) L8.getLong(x44));
                        }
                        if (L8.isNull(x45)) {
                            valueOf21 = null;
                        } else {
                            valueOf21 = Integer.valueOf((int) L8.getLong(x45));
                        }
                        if (valueOf21 != null) {
                            if (valueOf21.intValue() != 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            bool3 = Boolean.valueOf(z18);
                        } else {
                            bool3 = null;
                        }
                        if (L8.isNull(x46)) {
                            i17 = x36;
                            valueOf22 = null;
                        } else {
                            i17 = x36;
                            valueOf22 = Integer.valueOf((int) L8.getLong(x46));
                        }
                        int i44 = x47;
                        if (L8.isNull(i44)) {
                            bool4 = bool3;
                            num3 = valueOf22;
                            valueOf23 = null;
                        } else {
                            bool4 = bool3;
                            num3 = valueOf22;
                            valueOf23 = Integer.valueOf((int) L8.getLong(i44));
                        }
                        int i45 = x48;
                        if (L8.isNull(i45)) {
                            i18 = i44;
                            i19 = x37;
                            valueOf24 = null;
                        } else {
                            i18 = i44;
                            i19 = x37;
                            valueOf24 = Integer.valueOf((int) L8.getLong(i45));
                        }
                        int i46 = x49;
                        if (L8.isNull(i46)) {
                            num4 = valueOf23;
                            i20 = i45;
                            valueOf25 = null;
                        } else {
                            num4 = valueOf23;
                            i20 = i45;
                            valueOf25 = Integer.valueOf((int) L8.getLong(i46));
                        }
                        int i47 = x50;
                        if (L8.isNull(i47)) {
                            l12 = null;
                        } else {
                            l12 = L8.l(i47);
                        }
                        int i48 = x51;
                        if (L8.isNull(i48)) {
                            l13 = null;
                        } else {
                            l13 = L8.l(i48);
                        }
                        int i49 = x33;
                        int i50 = x52;
                        if (L8.isNull(i50)) {
                            c9 = null;
                        } else {
                            c9 = S1.p.c(L8.l(i50));
                        }
                        x52 = i50;
                        int i51 = x53;
                        if (L8.isNull(i51)) {
                            e10 = null;
                        } else {
                            e10 = S1.p.e(L8.l(i51));
                        }
                        x53 = i51;
                        int i52 = x54;
                        if (L8.isNull(i52)) {
                            i21 = i47;
                            i22 = i48;
                            valueOf26 = null;
                        } else {
                            i21 = i47;
                            i22 = i48;
                            valueOf26 = Integer.valueOf((int) L8.getLong(i52));
                        }
                        int i53 = x55;
                        if (L8.isNull(i53)) {
                            l14 = null;
                        } else {
                            l14 = L8.l(i53);
                        }
                        int i54 = x56;
                        if (L8.isNull(i54)) {
                            valueOf27 = null;
                        } else {
                            valueOf27 = Long.valueOf(L8.getLong(i54));
                        }
                        int i55 = x57;
                        if (L8.isNull(i55)) {
                            i23 = i53;
                            i24 = i54;
                            valueOf28 = null;
                        } else {
                            i23 = i53;
                            i24 = i54;
                            valueOf28 = Integer.valueOf((int) L8.getLong(i55));
                        }
                        if (valueOf28 != null) {
                            if (valueOf28.intValue() != 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            bool6 = Boolean.valueOf(z17);
                        }
                        arrayList2.add(new T1.r(j8, j9, l16, a4, i16, l11, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, bool4, num3, num4, valueOf24, valueOf25, l12, l13, c9, e10, valueOf26, l14, valueOf27, bool6));
                        int i56 = i24;
                        x57 = i55;
                        x33 = i49;
                        x50 = i21;
                        x51 = i22;
                        x54 = i52;
                        x55 = i23;
                        x56 = i56;
                        x37 = i19;
                        x48 = i20;
                        x34 = i41;
                        x35 = i42;
                        x47 = i18;
                        x49 = i46;
                        x36 = i17;
                    }
                    return arrayList2;
                } finally {
                }
            case 13:
                return f(obj);
            case 14:
                return g(obj);
            case 15:
                return h(obj);
            case 16:
                return k(obj);
            case 17:
                D0.a aVar3 = (D0.a) obj;
                o6.j.e(aVar3, "_connection");
                L8 = aVar3.L("SELECT * FROM tutorial_success_table ORDER BY tutorial_index ASC");
                try {
                    int x58 = X.x(L8, "tutorial_index");
                    int x59 = X.x(L8, "scenario_id");
                    ArrayList arrayList3 = new ArrayList();
                    while (L8.H()) {
                        arrayList3.add(new O((int) L8.getLong(x58), L8.getLong(x59)));
                    }
                    return arrayList3;
                } finally {
                    L8.close();
                }
            case 18:
                X7.a aVar4 = (X7.a) obj;
                o6.j.e(aVar4, "$this$buildSerialDescriptor");
                X7.a.a(aVar4, "JsonPrimitive", new a8.m(new B1.e(22)));
                X7.a.a(aVar4, "JsonNull", new a8.m(new B1.e(23)));
                X7.a.a(aVar4, "JsonLiteral", new a8.m(new B1.e(24)));
                X7.a.a(aVar4, "JsonObject", new a8.m(new B1.e(25)));
                X7.a.a(aVar4, "JsonArray", new a8.m(new B1.e(26)));
                return y.f7506a;
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                o6.j.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                a8.j jVar = (a8.j) entry.getValue();
                StringBuilder sb = new StringBuilder();
                b8.s.a(str, sb);
                sb.append(':');
                sb.append(jVar);
                return sb.toString();
            case 20:
                o6.j.e((CorruptionException) obj, "it");
                return new C0407b(true);
            case 21:
                Context context = (Context) obj;
                o6.j.e(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 22:
                Context context2 = (Context) obj;
                o6.j.e(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 23:
                o6.j.e((AbstractC0948c) obj, "$this$initializer");
                return new C1135m();
            case 24:
                Context context3 = (Context) obj;
                o6.j.e(context3, "it");
                if (context3 instanceof ContextWrapper) {
                    contextWrapper = (ContextWrapper) context3;
                } else {
                    contextWrapper = null;
                }
                if (contextWrapper == null) {
                    return null;
                }
                return contextWrapper.getBaseContext();
            case 25:
                Context context4 = (Context) obj;
                o6.j.e(context4, "it");
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case 26:
                AbstractC1143u abstractC1143u = (AbstractC1143u) obj;
                o6.j.e(abstractC1143u, "it");
                return abstractC1143u.f12814f;
            case 27:
                AbstractC1143u abstractC1143u2 = (AbstractC1143u) obj;
                o6.j.e(abstractC1143u2, "it");
                if (abstractC1143u2 instanceof C1144v) {
                    C1144v c1144v = (C1144v) abstractC1143u2;
                    return c1144v.n(c1144v.j.f4113a);
                }
                return null;
            case 28:
                View view = (View) obj;
                o6.j.e(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                o6.j.e(view2, "it");
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (C1146x) ((WeakReference) tag).get();
                }
                if (tag instanceof C1146x) {
                    return (C1146x) tag;
                }
                return null;
        }
    }

    public /* synthetic */ o(S1.p pVar, int i4) {
        this.f2073d = i4;
    }
}
