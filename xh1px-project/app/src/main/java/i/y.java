package i;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class y extends C5.p {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11741c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0860C f11742d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C, R.g gVar) {
        super(layoutInflaterFactory2C0860C);
        this.f11742d = layoutInflaterFactory2C0860C;
        this.f11743e = gVar;
    }

    @Override // C5.p
    public final IntentFilter d() {
        switch (this.f11741c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Type inference failed for: r3v12, types: [i.L, java.lang.Object] */
    @Override // C5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f() {
        Location location;
        boolean z8;
        long j;
        switch (this.f11741c) {
            case 0:
                if (u.a((PowerManager) this.f11743e)) {
                    return 2;
                }
                return 1;
            default:
                R.g gVar = (R.g) this.f11743e;
                M m6 = (M) gVar.f4989g;
                LocationManager locationManager = (LocationManager) gVar.f4988f;
                if (m6.f11627b > System.currentTimeMillis()) {
                    z8 = m6.f11626a;
                } else {
                    Context context = (Context) gVar.f4987e;
                    Location location2 = null;
                    if (AbstractC1638C.k(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        if (locationManager.isProviderEnabled("network")) {
                            location = locationManager.getLastKnownLocation("network");
                            if (AbstractC1638C.k(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                                try {
                                    if (locationManager.isProviderEnabled("gps")) {
                                        location2 = locationManager.getLastKnownLocation("gps");
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (location2 != null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                                location = location2;
                            }
                            z8 = false;
                            if (location == null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (L.f11622d == null) {
                                    L.f11622d = new Object();
                                }
                                L l6 = L.f11622d;
                                l6.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                                l6.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                                if (l6.f11625c == 1) {
                                    z8 = true;
                                }
                                long j5 = l6.f11624b;
                                long j8 = l6.f11623a;
                                l6.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                                long j9 = l6.f11624b;
                                if (j5 != -1 && j8 != -1) {
                                    if (currentTimeMillis > j8) {
                                        j5 = j9;
                                    } else if (currentTimeMillis > j5) {
                                        j5 = j8;
                                    }
                                    j = j5 + 60000;
                                } else {
                                    j = currentTimeMillis + 43200000;
                                }
                                m6.f11626a = z8;
                                m6.f11627b = j;
                            } else {
                                Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                                int i4 = Calendar.getInstance().get(11);
                                if (i4 < 6 || i4 >= 22) {
                                    z8 = true;
                                }
                            }
                        }
                    }
                    location = null;
                    if (AbstractC1638C.k(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    }
                    if (location2 != null) {
                    }
                    location = location2;
                    z8 = false;
                    if (location == null) {
                    }
                }
                if (!z8) {
                    return 1;
                }
                return 2;
        }
    }

    @Override // C5.p
    public final void l() {
        switch (this.f11741c) {
            case 0:
                this.f11742d.l(true, true);
                return;
            default:
                this.f11742d.l(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C, Context context) {
        super(layoutInflaterFactory2C0860C);
        this.f11742d = layoutInflaterFactory2C0860C;
        this.f11743e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
