'use client'
import React, { useState } from 'react';
import { signIn } from 'next-auth/react';
import { Button } from '@/components/ui/button';
import { Input } from '@/components/ui/input';
import { Label } from '@/components/ui/label';
import Image from 'next/image';
import { FcGoogle } from 'react-icons/fc';
import { FaGithub } from 'react-icons/fa';

export default function PageClient() {
    const [isUsernameLogin, setIsUsernameLogin] = useState(false);
    const [username, setUsername] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [emailForSignIn, setEmailForSignIn] = useState('');

    const handleLogin = (e: React.FormEvent<HTMLFormElement>) => {
        e.preventDefault();
        // Here, you can implement the logic to authenticate the user
        // based on the chosen login method (email/password or username)
        if (isUsernameLogin) {
            console.log('Logging in with username:', username);
        } else {
            console.log('Logging in with email:', email, 'and password:', password);
        }
    };

    return (
        <div className="h-screen w-screen relative">
            <Image
                className="object-cover filter blur-md opacity-70 absolute inset-0 z-0"
                src="/bg.jpg"
                alt="bg-image"
                fill
            />
            <div className="absolute inset-0 flex items-center justify-center z-10">
                <div className="bg-[#16202a] text-white p-10 rounded-lg">
                    <div className="my-4">
                        <h1 className="text-3xl font-semibold ">Login</h1>
                        <p className="mt-2 text-lg text-slate-500">
                            Welcome back! Please login to your account on EcoEats.
                        </p>
                    </div>
                    <form onSubmit={handleLogin} className="w-full max-w-md">
                        <Button
                            className="flex items-center w-full gap-4 px-12 mb-4 bg-transparent rounded-full"
                            variant="outline"
                            onClick={() => signIn('google')}
                        >
                            <FcGoogle size="25" />
                            Sign In With Google
                        </Button>
                        <Button
                            className="flex items-center w-full gap-4 px-12 mb-4 bg-transparent rounded-full"
                            variant="outline"
                            onClick={() => signIn('github')}
                        >
                            <FaGithub size="25" />
                            Sign In With GitHub
                        </Button>
                        <Label htmlFor="emailForSignIn">Email for sign-in*</Label>
                        <Input
                            className="mt-2 mb-4 bg-transparent rounded-full"
                            type="email"
                            id="emailForSignIn"
                            placeholder="Email"
                            value={emailForSignIn}
                            onChange={(e) => setEmailForSignIn(e.target.value)}
                        />
                        <Button
                            className="flex items-center w-full gap-4 px-12 mb-4 bg-transparent rounded-full"
                            variant="outline"
                            onClick={() => signIn('email', { email: emailForSignIn })}
                        >
                            Sign In With Email
                        </Button>
                    </form>
                    <p className="mt-4 text-xs text-slate-200">
                        @2024 All rights reserved
                    </p>
                </div>
            </div>
        </div>
    );
}