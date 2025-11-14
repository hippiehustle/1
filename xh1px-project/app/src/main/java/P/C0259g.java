package P;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* renamed from: P.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4268a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0260h f4269b;

    /* renamed from: c, reason: collision with root package name */
    public VelocityTracker f4270c;

    /* renamed from: d, reason: collision with root package name */
    public float f4271d;

    /* renamed from: e, reason: collision with root package name */
    public int f4272e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f4273f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f4274g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f4275h = {Integer.MAX_VALUE, 0};

    public C0259g(Context context, InterfaceC0260h interfaceC0260h) {
        this.f4268a = context;
        this.f4269b = interfaceC0260h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00bc, code lost:
    
        if (r5 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0075, code lost:
    
        if (r14 >= 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent, int i4) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z8;
        float f8;
        float f9;
        float f10;
        long j;
        float f11;
        float f12;
        float sqrt;
        float f13;
        float f14;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i14 = this.f4273f;
        int[] iArr = this.f4275h;
        if (i14 == source && this.f4274g == deviceId && this.f4272e == i4) {
            z8 = false;
            i8 = 1;
            i9 = 0;
        } else {
            Context context = this.f4268a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i8 = 1;
            int i15 = Build.VERSION.SDK_INT;
            i9 = 0;
            if (i15 >= 34) {
                Method method = P.f4220a;
                i10 = AbstractC0274w.f(viewConfiguration, deviceId2, i4, source2);
            } else {
                Method method2 = P.f4220a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i4, source2) != null) {
                    Resources resources = context.getResources();
                    if (source2 == 4194304 && i4 == 26) {
                        i11 = resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
                    } else {
                        i11 = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (i11 != -1) {
                        if (i11 != 0) {
                            i10 = resources.getDimensionPixelSize(i11);
                        }
                    } else {
                        i10 = viewConfiguration.getScaledMinimumFlingVelocity();
                    }
                }
                i10 = Integer.MAX_VALUE;
            }
            iArr[0] = i10;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i15 >= 34) {
                i12 = AbstractC0274w.e(viewConfiguration, deviceId3, i4, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i4, source3) != null) {
                    Resources resources2 = context.getResources();
                    if (source3 == 4194304 && i4 == 26) {
                        i13 = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                    } else {
                        i13 = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (i13 != -1) {
                        if (i13 != 0) {
                            i12 = resources2.getDimensionPixelSize(i13);
                        }
                    } else {
                        i12 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                }
                i12 = Integer.MIN_VALUE;
            }
            iArr[1] = i12;
            this.f4273f = source;
            this.f4274g = deviceId;
            this.f4272e = i4;
            z8 = true;
        }
        if (iArr[i9] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f4270c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4270c = null;
                return;
            }
            return;
        }
        if (this.f4270c == null) {
            this.f4270c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f4270c;
        Map map = AbstractC0275x.f4313a;
        velocityTracker2.addMovement(motionEvent);
        float f15 = 0.0f;
        int i16 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0275x.f4313a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C0276y());
            }
            C0276y c0276y = (C0276y) map2.get(velocityTracker2);
            long[] jArr = c0276y.f4315b;
            long eventTime = motionEvent.getEventTime();
            if (c0276y.f4317d != 0 && eventTime - jArr[c0276y.f4318e] > 40) {
                c0276y.f4317d = i9;
                c0276y.f4316c = 0.0f;
            }
            int i17 = (c0276y.f4318e + 1) % 20;
            c0276y.f4318e = i17;
            int i18 = c0276y.f4317d;
            if (i18 != 20) {
                c0276y.f4317d = i18 + 1;
            }
            c0276y.f4314a[i17] = motionEvent.getAxisValue(26);
            jArr[c0276y.f4318e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0276y c0276y2 = (C0276y) AbstractC0275x.f4313a.get(velocityTracker2);
        if (c0276y2 != null) {
            float[] fArr = c0276y2.f4314a;
            long[] jArr2 = c0276y2.f4315b;
            int i19 = c0276y2.f4317d;
            if (i19 >= 2) {
                int i20 = c0276y2.f4318e;
                int i21 = ((i20 + 20) - (i19 - 1)) % 20;
                long j5 = jArr2[i20];
                while (true) {
                    j = jArr2[i21];
                    if (j5 - j <= 100) {
                        break;
                    }
                    c0276y2.f4317d--;
                    i21 = (i21 + 1) % 20;
                }
                int i22 = c0276y2.f4317d;
                if (i22 >= 2) {
                    if (i22 == 2) {
                        int i23 = (i21 + 1) % 20;
                        long j8 = jArr2[i23];
                        if (j != j8) {
                            sqrt = fArr[i23] / ((float) (j8 - j));
                            f11 = Float.MAX_VALUE;
                            f8 = 0.0f;
                        }
                    } else {
                        f11 = Float.MAX_VALUE;
                        float f16 = 0.0f;
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            f12 = 1.0f;
                            if (i24 >= c0276y2.f4317d - 1) {
                                break;
                            }
                            int i26 = i24 + i21;
                            long j9 = jArr2[i26 % 20];
                            int i27 = (i26 + 1) % i16;
                            if (jArr2[i27] == j9) {
                                f13 = f15;
                            } else {
                                i25++;
                                if (f16 < f15) {
                                    f12 = -1.0f;
                                }
                                f13 = f15;
                                float sqrt2 = f12 * ((float) Math.sqrt(Math.abs(f16) * 2.0f));
                                float f17 = fArr[i27] / ((float) (jArr2[i27] - j9));
                                f16 += Math.abs(f17) * (f17 - sqrt2);
                                if (i25 == i8) {
                                    f16 *= 0.5f;
                                }
                            }
                            i24++;
                            f15 = f13;
                            i16 = 20;
                            i8 = 1;
                        }
                        f8 = f15;
                        if (f16 < f8) {
                            f12 = -1.0f;
                        }
                        sqrt = f12 * ((float) Math.sqrt(Math.abs(f16) * 2.0f));
                    }
                    f14 = sqrt * 1000;
                    c0276y2.f4316c = f14;
                    if (f14 >= (-Math.abs(f11))) {
                        c0276y2.f4316c = -Math.abs(f11);
                    } else if (c0276y2.f4316c > Math.abs(f11)) {
                        c0276y2.f4316c = Math.abs(f11);
                    }
                }
            }
            f11 = Float.MAX_VALUE;
            sqrt = 0.0f;
            f8 = 0.0f;
            f14 = sqrt * 1000;
            c0276y2.f4316c = f14;
            if (f14 >= (-Math.abs(f11))) {
            }
        } else {
            f8 = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f9 = AbstractC0274w.b(velocityTracker2, i4);
        } else if (i4 == 0) {
            f9 = velocityTracker2.getXVelocity();
        } else if (i4 == 1) {
            f9 = velocityTracker2.getYVelocity();
        } else {
            C0276y c0276y3 = (C0276y) AbstractC0275x.f4313a.get(velocityTracker2);
            if (c0276y3 != null && i4 == 26) {
                f9 = c0276y3.f4316c;
            } else {
                f9 = f8;
            }
        }
        InterfaceC0260h interfaceC0260h = this.f4269b;
        float f18 = interfaceC0260h.f() * f9;
        float signum = Math.signum(f18);
        if (z8 || (signum != Math.signum(this.f4271d) && signum != f8)) {
            interfaceC0260h.h();
        }
        if (Math.abs(f18) < iArr[0]) {
            return;
        }
        float max = Math.max(-r1, Math.min(f18, iArr[1]));
        if (interfaceC0260h.d(max)) {
            f10 = max;
        } else {
            f10 = f8;
        }
        this.f4271d = f10;
    }
}
